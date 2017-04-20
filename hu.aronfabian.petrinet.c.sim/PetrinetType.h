#ifndef PETRINETTYPE_H
#define PETRINETTYPE_H

/**
 * Petri net structure
 */
typedef struct {
	int *M; /** State matrix */
	int **W; /** Neighbours matrix */
	int numPlace; /** Number of places */
	int numTransitoin; /** Number of transitions */
}PetriNet;

extern PetriNet petrinet;

#endif /* PETRINETTYPE_H */
