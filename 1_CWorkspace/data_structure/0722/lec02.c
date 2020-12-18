#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;
void add(N* root, int data) {
	N* node = (N*)malloc(sizeof(N));
	node->data = data;
	node->next = NULL;

	N* p = root;
	while (p->next != NULL) {
		p = p->next;
	}

	p->next = node;
}
void addd(N* root, int data, int c) {
	N* node = (N *)malloc(sizeof(N));
	node->data = data;
	node->next = NULL;
	N* p = root;

	while (p->next != NULL) {
		c--;
		if (c == 0) {
			node->next = p->next;
		}
		p = p->next;
	}

	p->next = node;
}
void show(N* root) {
	printf("show(): ");
	N* p = root->next;
	while (p != NULL) {
		printf("%d ", p->data);
		p = p->next;
		if (p != NULL) {
			printf("-> ");
		}
	}
	printf("\n");
}

int main() {

	N* head = (N*)malloc(sizeof(N));
	head->next = NULL;

	int n, c;
	scanf("%d%d", &n, &c);
	for (int i = 0; i < n - 1; i++) {
		int data;
		scanf("%d", &data);
		add(head, data);
	}
	int data;
	scanf("%d", &data);
	addd(head, data, c);
	show(head);

	return 0;
}