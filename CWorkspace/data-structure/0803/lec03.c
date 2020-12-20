#include<stdio.h>
#include<stdlib.h>

// 노드 생성을 위한 구조체 선언
typedef struct NODE {
	int data;
	struct NODE* left;
	struct NODE* right;
}N;

// 노드 생성
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

// 전위순회
void preorder(N* node) {
	if (node != NULL) {
		printf("%d ", node->data);
		preorder(node->left);
		preorder(node->right);
	}
}
// 중위순회
void inorder(N* node) {
	if (node != NULL) {
		inorder(node->left);
		printf("%d ", node->data);
		inorder(node->right);
	}
}
// 후위순회
void postorder(N* node) {
	if (node != NULL) {
		postorder(node->left);
		postorder(node->right);
		printf("%d ", node->data);
	}
}

// 노드 삭제
void del(N* node, int data) {

	// TODO

}

int main() {
	N* root = NULL;

	int act;
	while (1) {
		printf("1.노드생성 2.전위순회 3.중위순회 4.후위순회 5.노드삭제 6.종료\n");
		scanf("%d", &act);
		if (act == 1) {
			int data;
			printf("데이터입력: ");
			scanf("%d", &data);
			root = create(root, data);
		}
		else if (act == 2) {
			preorder(root); // 전위순회
			printf("\n");
		}
		else if (act == 3) {
			inorder(root); // 중위순회
			printf("\n");
		}
		else if (act == 4) {
			postorder(root); // 후위순회
			printf("\n");
		}
		else if (act == 5) {
			int data;
			printf("삭제할데이터입력: ");
			scanf("%d", &data);
			del(root, data);
		}
		else {
			printf("프로그램종료\n");
			break;
		}
	}

	return 0;
}