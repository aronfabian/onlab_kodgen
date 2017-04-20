#include <stdio.h>
#include "PetrinetType.h"

#define FALSE 0 /** boolean FALSE */
#define TRUE 1 /** boolean TRUE */

typedef char boolean; /** boolean type */

/**
 * Check validity of the transition number.
 * @param *p pointer to the PetriNet
 * @param trans number of the transitions
 * @return boolean, true means valid
 */
boolean isValidTrans(PetriNet *p, int trans){
	if(trans < p->numTransitoin){
		return TRUE;
	}
	return FALSE;
}

/**
 * Check validity of place number.
 * @param *p pointer to the PetriNet
 * @param place number of the place
 * @return boolean, true means valid
 */
boolean isValidPlace(PetriNet *p, int place){
	if(place < p->numPlace){
		return TRUE;
	}
	return FALSE;
}

/**
 * Checks the transition's readiness.
 * @param *p a pointer to the PetriNet
 * @param trans number of the transition
 * @return boolean, true means ready
 */
boolean isReady(PetriNet *p, int trans) {
	boolean ready = TRUE;
	for (int j = 0; j < p->numPlace; j++) {
		int currentWeight = p->W[trans*p->numPlace + j];
		if ((currentWeight < 0) && ((currentWeight + p->M[j]) < 0)) {
			ready = FALSE;
			break;
		}
	}
	return ready;
}

/**
 * Transition fire.
 * New state: M' = M + W * et (et select a row of W matrix)
 * @param *p a pointer to the PetriNet
 * @param fireTrans number of the transition
 * @return void
 */
void fire(PetriNet *p, int fireTrans) {
	if(!isValidTrans(p, fireTrans)){
		printf("Transitions %d is not valid!\n-------------------------------\n", fireTrans);
		return;
	}
	if (!isReady(p, fireTrans)) {
		printf("Transitions %d is not ready to fire!\n-------------------------------\n", fireTrans);
		return;
	}
	int i;
	for (i = 0; i < p->numPlace; i++) {
		int currentWeight = p->W[fireTrans*p->numPlace + i];
		p->M[i] += currentWeight;
	}
	printf("Transitions %d has fired!\n-------------------------------\n", fireTrans);
	return;
}

/**
 * Add new token to a place
 * @param place place number
 * @param *p pointer to the PetriNet
 * @return void
 */
void newToken(int place, PetriNet *p) {
	if(isValidPlace(p, place)){
		p->M[place]++;
	}
	return;
}

/**
 * Print the ready transitions.
 * @param *p a pointer to the PetriNet
 * @return void
 */
void readyTrans(PetriNet *p) {

	boolean isNotAvailable = TRUE; /** None of the transitions is ready */

	/**
	 * Loop for the transitions
	 */
	for (int i = 0; i < p->numTransitoin; i++){
	
		/**
		 * If a transition is ready, set isNotAvailable FALSE
		 * and print out the current transition.
		 */
		if (TRUE == isReady(p, i)) {
			printf("Transition %d is ready to fire!\n", i);
			isNotAvailable = FALSE;
		}
	}
	/**
	 * If all of the transitions aren't ready:
	 */
	if (isNotAvailable == TRUE) {
		printf("None of the transitions is ready to fire!\n");
	}
	printf("-------------------------------\n");
	return;
}

/**
 * Print the PetriNet's state.
 * @param *p a pointer to the PetriNet
 * @return void
 */
void printState(PetriNet *p) {
	printf("\nActual state:");
	for (int i = 0; i < p->numPlace; i++){
		printf("\n	M[%d]=%d", i, p->M[i]);
	}
	printf("\n-------------------------------\n");
}

void main() {
	
	while (1) {
		printState(&petrinet); /** Print actual state */
		readyTrans(&petrinet); /** Print ready transitions */
		printf(">");
		fflush(stdout);
		int fireTrans=0;
		scanf_s("%d", &fireTrans);
		while(!isValidTrans(&petrinet, fireTrans)){
			printf("Transitions %d is not valid!\n-------------------------------\n", fireTrans);
			scanf_s("%d", &fireTrans);
		}
		fire(&petrinet, fireTrans);
	}
	
	return;
}
