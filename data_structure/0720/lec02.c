#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;					// �����ͺ�, �������ʵ�
	struct NODE* next;	// �ּҺ�, �ּ��ʵ�, ��ũ�ʵ�
}N; // �ڱ����� ����ü

int main() {

	N *head = (N*)malloc(sizeof(N));

	N *node1 = (N*)malloc(sizeof(N));
	node1->data = 100;
	head->next = node1;

	// �����Ϳ��� ->, ���� �����Ϳ��� .�� �̿�

	N *node2 = (N*)malloc(sizeof(N));
	node2->data = 200;
	node1->next = node2;
	node2->next = NULL;

	// �湮�� ������ == ��ȸ�� ������
	N *p = head->next; // node1
	while (p != NULL) {
		printf("%d ", p->data);
		p = p->next;
	}

	printf("\n");

	return 0;
}