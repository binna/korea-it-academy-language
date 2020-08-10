// 트리 : 노드들의 집합, 사이클이 없음
// 이진트리 : 자식이 2개(== 주소부가 2개, binary tree)

// root : 최상위 노드, 부모노드가 없음
// leaf : 최하위 노드, 자식노드가 없음

#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* left;
	struct NODE* right;
}N;

int main() {
	// 최상위 노트(root) 생성, 
	// 값 10 대입
	N* root = (N*)malloc(sizeof(N));
	root->data = 10;
	root->left = NULL;
	root->right = NULL;

	// 최상위 노드(root)의 left 노드 생성, 
	// 값은 scanf를 통해 직접 입력 받음
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