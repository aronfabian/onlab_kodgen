package hu.aronfabian.petrinet.plugin.simulator.ext;

import org.eclipse.emf.common.util.EList;

import petrinet.Arc;
import petrinet.Net;
import petrinet.Place;
import petrinet.Transition;

public class NeighboursMatrix {

	public int[][] W;
	public int transitions;
	public int places;

	public NeighboursMatrix(Net net) {
		
		transitions = net.getTransition().size();
		places = net.getPlace().size();
		
		W = new int[transitions][places]; 
		
		EList<Arc> edges = net.getArc();
		for (Arc arc : edges){
			if (arc.getFrom() instanceof Transition){
				Transition currentTrans = (Transition) arc.getFrom();
				Place currentPlace = (Place) arc.getTo();
				W[Integer.parseInt(currentTrans.getName())][Integer.parseInt(currentPlace.getName())] = arc.getWeight();
			}
			if (arc.getFrom() instanceof Place){
				Transition currentTrans = (Transition) arc.getTo();
				Place currentPlace = (Place) arc.getFrom();
				W[Integer.parseInt(currentTrans.getName())][Integer.parseInt(currentPlace.getName())] = -arc.getWeight();
			}
		}
	}

	public int[][] getW() {
		return W;
	}

	public void setW(int[][] w) {
		W = w;
	}

	@Override
	public String toString() {
		StringBuilder matrix = new StringBuilder();
		matrix.append("{ ");
		for (int i = 0; i < transitions; i++){
			matrix.append("{ ");
			for (int j = 0; j < places; j++){
				matrix.append(W[i][j] + ", ");
			}
			matrix.append(" }, ");
		}
		matrix.append(" }");
		return  matrix.toString();
	}
	
	
	
	
}
