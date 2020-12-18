#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;

void add(N* root, int data) {
	N* node = (N *)malloc(sizeof(N));
	node->data = data;
	node->next = NULL;
	
	// ��� ����
	// ����������� next�� �Ź� ���ο� ��带 ����ų���ֵ��� �ؾ���!
	N *p = root;
	while (p->next != NULL) { // ��������带 ã������ [p->next] �ۼ�!!!
		if (p->next->data == data) {
			printf("%d�� �̹� �����մϴ�.\n", data);
			return;
		}
		else if (p->next->data > data) {
			node->next = p->next;
			break;
		}
		p = p->next;
	}

	p->next = node;

}
void nodeRemove(N *root, int data) {
	N *p = root;

	while (p->next != NULL) {
		if (data == p->next->data) {
			p->next = p->next->next;
			return;
		}
		p = p->next;
	}

	printf("%d�� ���������ʴ� �������Դϴ�.\n", data);

}
void show(N *root) {
	printf("show(): ");

	N *p = root->next;

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

	N * head = (N*)malloc(sizeof(N));
	head->next = NULL;

	int act;
	while (1) {
		printf("1.���� 2.���� 3.��� 4.����\n");
		printf("��ȣ�Է�: ");
		scanf("%d", &act);
		if (act == 1) {
			int data;
			printf("�������Է�: ");
			scanf("%d", &data);
			add(head, data);
		}
		else if (act == 2) {
			int data;
			printf("�������Է�: ");
			scanf("%d", &data);
			nodeRemove(head, data);
		}
		else if (act == 3) {
			show(head);
		}
		else {
			printf("���α׷�����\n");
			break;
		}
	}

	return 0;
}