package hu.aronfabian.petrinet.plugin.simulator.xtend

import petrinet.Net
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.ResourcesPlugin
import java.io.ByteArrayInputStream

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import hu.aronfabian.petrinet.plugin.simulator.ext.NeighboursMatrix
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IResource

class SimulatorInputGenerator {
	static def generateCode(IPath folder, Net net, IProgressMonitor monitor){
		val String project =  folder.segment(0);
			var IFile file;
			var IFolder iFolder;
			if(folder.segmentCount() == 1){
				iFolder = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFolder("/simulator")
				file = iFolder.getFile("SimulatorInput.c");
			}else{
				iFolder = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFolder(folder.removeFirstSegments(1) + "/simulator")
				file = iFolder.getFile("SimulatorInput.c");
			}
			 
			try {
				if (!iFolder.exists()){ 
    			iFolder.create(IResource.NONE, true, null);
    			}
				if (!file.exists()) {

					file.create(new ByteArrayInputStream(generateSimulatorInput(net).getBytes()), true, monitor);
				} else {
					file.setContents(new ByteArrayInputStream(generateSimulatorInput(net).getBytes()), true, true, monitor);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static def String generateSimulatorInput(Net net) {
		val places = net.place
		val transitions = net.transition
		val w = new NeighboursMatrix(net)
		'''
		#include "PetrinetType.h"
		
		int state[] = { «FOR place : places SEPARATOR ','» «place.tokenNum»«ENDFOR» };
		int neigh[«transitions.size»][«places.size»] = «w.toString»;
		
		PetriNet petrinet = { &state, &neigh, «places.size», «transitions.size» };
		'''
	}
	
}