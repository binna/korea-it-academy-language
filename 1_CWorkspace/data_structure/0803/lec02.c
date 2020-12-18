// Ʈ�� : ������ ����, ����Ŭ�� ����
// ����Ʈ�� : �ڽ��� 2��(== �ּҺΰ� 2��, binary tree)

// root : �ֻ��� ���, �θ��尡 ����
// leaf : ������ ���, �ڽĳ�尡 ����

#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* left;
	struct NODE* right;
}N;

int main() {
	// �ֻ��� ��Ʈ(root) ����, 
	// �� 10 ����
	N* root = (N*)malloc(sizeof(N));
	root->data = 10;
	root->left = NULL;
	root->right = NULL;

	// �ֻ��� ���(root)�� left ��� ����, 
	// ���� scanf�� ���� ���� �Է� ����
	N* node = (N*)malloc(sizeof(N));
	int data;
	scanf("%d", &data);
	node->data = data;
	node->left = NULL;
	node->right = NULL;
	if (root->data > node->data) {
		root->left = node;
	}
	else {
		root->right = node;
	}

	return 0;
}