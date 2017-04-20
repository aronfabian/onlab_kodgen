package hu.aronfabian.petrinet.plugin.graphml.base;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import hu.aronfabian.petrinet.plugin.graphml.xtend.GraphPrint;
import petrinet.Arc;
import petrinet.Net;
import petrinet.Place;
import petrinet.Transition;

public class PetriNetGraphml {
	public static String errorLog;
	
	public static boolean check(Net netRoot){
		//ha valami nem OK visszajelezni
		//bejárjuk a gráfot
		StringBuilder log = new StringBuilder();
		boolean error = false;
		for(Arc arc : netRoot.getArc()){
			if(arc.getFrom() instanceof Place && arc.getTo() instanceof Place){
				error = true;
				log.append("\nError: Arc Number " + arc.getId());
			}
			if(arc.getFrom() instanceof Transition && arc.getTo() instanceof Transition){
				error = true;
				log.append("\nError: Arc Number " + arc.getId());
			}
			if(arc.getFrom() == null || arc.getTo() == null){
				error = true;
				log.append("\nError: Arc Number " + arc.getId());
			}	
		}
		if(error){
			errorLog = log.toString();
			return false;
		}
		return true;
	}
	
	public static String generateGraphml(Net netRoot){
		
		// TODO bemenetek ellenõrzése
		if(!check(netRoot)){
			return null;
		}
		
		Set<Integer> viewedPlaces = new HashSet<Integer>();
		Set<Integer> viewedTransitions = new HashSet<Integer>();

		StringBuilder sb = new StringBuilder();
		sb.append(GraphPrint.base());

		// gráf bejárása

		Place recentPlace;
		Transition recentTransition;
		for(Arc arc : netRoot.getArc()){
			//p-->t él
			if(arc.getFrom() instanceof Place){
				recentPlace = (Place) arc.getFrom();
				recentTransition = (Transition) arc.getTo();
				if(!viewedPlaces.contains(recentPlace)){
					sb.append(GraphPrint.place(recentPlace.getName(), recentPlace.getTokenNum()));
				}
				if(!viewedTransitions.contains(recentTransition)){
					sb.append(GraphPrint.transition(recentTransition.getName()));
				}
				sb.append(GraphPrint.arcPtoT(arc.getId(), recentPlace.getName(), recentTransition.getName(), arc.getWeight()));
			}
			//t-->p él
			else{
				recentPlace = (Place) arc.getTo();
				recentTransition = (Transition) arc.getFrom();
				if(!viewedPlaces.contains(recentPlace)){
					sb.append(GraphPrint.place(recentPlace.getName(), recentPlace.getTokenNum()));
				}
				if(!viewedTransitions.contains(recentTransition)){
					sb.append(GraphPrint.transition(recentTransition.getName()));
				}
				sb.append(GraphPrint.arcTtoP(arc.getId(), recentTransition.getName(), recentPlace.getName(), arc.getWeight()));
			}
		}
		
		// kimeneti String lezárása
		sb.append(GraphPrint.end());

		return sb.toString();
	}
	
	public static void generate(IPath folder, Net net, IProgressMonitor monitor){
		
		if(!PetriNetGraphml.check(net)){
			Display.getDefault().asyncExec(new Runnable() {

				@Override
				public void run() {
					MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", PetriNetGraphml.errorLog);
				}
			});
		}else{
			String project =  folder.segment(0);
			IFile file;
			IFolder iFolder;
			if(folder.segmentCount() == 1){
				iFolder = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFolder("/graphml");
				file = iFolder.getFile("test.graphml");
			}else{
				folder = folder.removeFirstSegments(1);
				iFolder = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFolder(folder + "/graphml");
				file = iFolder.getFile("test.graphml");
			}
			 
			try {
				if (!iFolder.exists()){ 
	    			iFolder.create(IResource.NONE, true, null);
	    			}
				if (!file.exists()) {

					file.create(new ByteArrayInputStream(PetriNetGraphml.generateGraphml(net).getBytes()), true, monitor);
				} else {
					file.setContents(new ByteArrayInputStream(PetriNetGraphml.generateGraphml(net).getBytes()), true, true, monitor);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
