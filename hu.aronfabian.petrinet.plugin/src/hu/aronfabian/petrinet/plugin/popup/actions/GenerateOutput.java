package hu.aronfabian.petrinet.plugin.popup.actions;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import hu.aronfabian.petrinet.plugin.xtend.GraphPrint;
import petrinet.Net;
import petrinet.Place;
import petrinet.Transition;

public class GenerateOutput implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;

	/**
	 * Constructor for Action1.
	 */
	public GenerateOutput() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Net net = (Net) structuredSelection.getFirstElement();
			Set<Integer> viewedPlaces = new HashSet<Integer>();
			Set<Integer> viewedTransitions = new HashSet<Integer>();

			WorkspaceJob job = new WorkspaceJob("Generation") {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) {
					// TODO bemenetek ellenõrzése
					StringBuilder sb = new StringBuilder();
					sb.append(GraphPrint.base());

					// TODO a gráf bejárása
					EList<Place> placeList = net.getPlace();
					int edgeId = 0;
					for (Place currentPlace : placeList) {
						if (viewedPlaces.add(currentPlace.getId())) {
							sb.append(GraphPrint.place(currentPlace.getId()));
						}
						EList<Transition> reachableTransitions = currentPlace.getTransition();
						for (Transition currentTransition : reachableTransitions) {
							if (viewedTransitions.add(currentTransition.getId())) {
								sb.append(GraphPrint.transition(currentTransition.getId()));
							}
							sb.append(GraphPrint.arcPtoT(edgeId, currentPlace.getId(), currentTransition.getId()));
							edgeId++;
						}

					}
					EList<Transition> transitionList = net.getTransition();
					for (Transition currentTransition : transitionList) {
						if (viewedTransitions.add(currentTransition.getId())) {
							sb.append(GraphPrint.transition(currentTransition.getId()));
						}
						EList<Place> reachablePlaces = currentTransition.getPlace();
						for (Place currentPlace : reachablePlaces) {
							if (viewedPlaces.add(currentPlace.getId())) {
								sb.append(GraphPrint.place(currentPlace.getId()));
							}
							sb.append(GraphPrint.arcTtoP(edgeId, currentTransition.getId(), currentPlace.getId()));
							edgeId++;
						}

					}

					// TODO kimeneti String lezárása
					sb.append(GraphPrint.end());

					IFile file = ResourcesPlugin.getWorkspace().getRoot().getProject("petritesting")
							.getFile("test.graphml");
					try {
						if (!file.exists()) {

							file.create(new ByteArrayInputStream(sb.toString().getBytes()), true, monitor);
						} else {
							file.setContents(new ByteArrayInputStream(sb.toString().getBytes()), true, true, monitor);
						}
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
