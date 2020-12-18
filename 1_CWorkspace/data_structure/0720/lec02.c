#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;					// 데이터부, 데이터필드
	struct NODE* next;	// 주소부, 주소필드, 링크필드
}N; // 자기참조 구조체

int main() {

	N *head = (N*)malloc(sizeof(N));

	N *node1 = (N*)malloc(sizeof(N));
	node1->data = 100;
	head->next = node1;

	// 포인터에는 ->, 실제 데이터에는 .을 이용

	N *node2 = (N*)malloc(sizeof(N));
	node2->data = 200;
	node1->next = node2;
	node2->next = NULL;

	// 방문용 포인터 == 순회용 포인터
	N *p = head->next; // node1
	while (p != NULL) {
		printf("%d ", p->data);
		p = p->next;
	}

	printf("\n");

	return 0;
}