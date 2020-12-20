#include<stdio.h>
#include<stdlib.h>

// ��� ������ ���� ����ü ����
typedef struct NODE {
	int data;
	struct NODE* left;
	struct NODE* right;
}N;

// ��� ����
N* create(N* node, int data) {
	if (node == NULL) {
		node = (N*)malloc(sizeof(N));
		node->data = data;
		node->left = NULL;
		node->right = NULL;
	}
	else {
		if (node->data > data) {
			node->left = create(node->left, data);
		}
		else {
			node->right = create(node->right, data);
		}
	}
	return node;
}

// ������ȸ
void preorder(N* node) {
	if (node != NULL) {
		printf("%d ", node->data);
		preorder(node->left);
		preorder(node->right);
	}
}
// ������ȸ
void inorder(N* node) {
	if (node != NULL) {
		inorder(node->left);
		printf("%d ", node->data);
		inorder(node->right);
	}
}
// ������ȸ
void postorder(N* node) {
	if (node != NULL) {
		postorder(node->left);
		postorder(node->right);
		printf("%d ", node->data);
	}
}

// ��� ����
void del(N* node, int data) {
	N* c = node;
	N* p = NULL;		// ���־� ��Ʃ��������� �ʱ�ȭ���� ���� �������� ����� ������
	while (c != NULL && c->data != data) {
		p = c;
		c = data < c->data ? c->left : c->right;
	}
	if (c == NULL) {
		printf("�����ҳ�尡����!\n");
		return;
	}
	if (c->left == NULL && c->right == NULL) {
		// ������ ��尡 ��������϶�
		if (p->left == c) {
			p->left = NULL;
		}
		else {
			p->right = NULL;
		}
	}
	else if (c->left == NULL || c->right == NULL) {
		// ������ ��尡 �ϳ��� �ڽĳ�带 ���� ���
		if (p->left == c) {
			c = c->left != NULL ? c->left : c->right;
			p->left = c;
		}
		else {
			c = c->left != NULL ? c->left : c->right;
			p->right = c;
		}
	}
	else {
		// ������ ��尡 �� ���� �ڽĳ�带 ���� ���->������ �ڽĵ� �߿��� ���� ������带 ã��!
		N* subp = c;
		N* subc = c->right;
		while (subc->left != NULL) {
			subp = subc;
			subc = subc->left;
		}
		if (c == subp) {
			c->right = subc->right;
		}
		else {
			subp->left = subc->right;
		}
		c->data = subc->data;
	}
}

int main() {
	N* root = NULL;

	int act;
	while (1) {
		printf("1.������ 2.������ȸ 3.������ȸ 4.������ȸ 5.������ 6.����\n");
		scanf("%d", &act);
		if (act == 1) {
			int data;
			printf("�������Է�: ");
			scanf("%d", &data);
			root = create(root, data);
		}
		else if (act == 2) {
			preorder(root); // ������ȸ
			printf("\n");
		}
		else if (act == 3) {
			inorder(root); // ������ȸ
			printf("\n");
		}
		else if (act == 4) {
			postorder(root); // ������ȸ
			printf("\n");
		}
		else if (act == 5) {
			int data;
			printf("�����ҵ������Է�: ");
			scanf("%d", &data);
			del(root, data);
		}
		else {
			printf("���α׷�����\n");
			break;
		}
	}

	return 0;
}