#include <stdio.h>
#include <stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;

int main() {

	N* head = (N*)malloc(sizeof(N));

	N* node1 = (N*)malloc(sizeof(N));
	node1->data = 11;
	head = node1;

	N* node2 = (N*)malloc(sizeof(N));
	node2->data = 12;
	node1->next = node2;


	N* node3 = (N*)malloc(sizeof(N));
	node3->data = 13;
	node2->next = node3;

	N* node4 = (N*)malloc(sizeof(N));
	node4->data = 14;
	node3->next = node4;
	node4->next = NULL;

	N* p = head->next;
	while (p != NULL) {
		printf("%d ", p->data);
		p = p->next;
	}

	printf("\n");

	return 0;
}