package hu.aronfabian.petrinet.plugin.popup.actions;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import example1.HelloWorld;
import petrinet.Arc;
import petrinet.Net;

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
			Set<Integer> places = new HashSet<Integer>();
			Set<Integer> transitions = new HashSet<Integer>();

			WorkspaceJob job = new WorkspaceJob("Generation") {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor){
					// TODO bemenetek ellenõrzése
					StringBuilder sb = new StringBuilder();
					sb.append(HelloWorld.base());

					// TODO kimeneti String elõkészítése
					for (Arc arc : net.getArc()) {
						if (!places.contains(arc.getPlace().getId())) {
							places.add(arc.getPlace().getId());
							// TODO az adott Place-t a kimeneti Stringbe írni
							sb.append(HelloWorld.place(arc.getPlace().getId()));
						}
						if (!transitions.contains(arc.getTransition().getId())) {
							transitions.add(arc.getTransition().getId());
							// TODO az adott Transitions-t a kimeneti Stringbe
							// írni
							sb.append(HelloWorld.transition(arc.getTransition().getId()));
						}

						// TODO az aktuális él kimeneti Stringbe írása
						sb.append(HelloWorld.arc(arc.getId(), arc.getPlace().getId(), arc.getTransition().getId()));
					}
					// TODO kimeneti String lezárása
					sb.append(HelloWorld.end());

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
