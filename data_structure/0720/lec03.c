// 1. ����
// 2. ����
// + ���� ������ ���� ���ϰ� ó��
// 3. ���
// + �ߺ� ���� ��������

#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;

void add(N *root, int data) {
	// ������
	N *node = (N *)malloc(sizeof(N));
	node->data = data;
	node->next = NULL;

	// ��� ����
	// ����������� next�� �Ź� ���ο� ��带 ����ų���ֵ��� �ؾ���!
	N *p = root;
	while (p->next != NULL) { // ��������带 ã������ [p->next] �ۼ�!!!
		p = p->next;
		printf("%d ", p->data);
	}
	p->next = node;
	printf("\n----------\n");
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

		}
		else if (act == 3) {

		}
		else {
			printf("���α׷�����\n");
			break;
		}
	}

	return 0;
}