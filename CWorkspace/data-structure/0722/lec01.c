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
	
	// 노드 생성
	// 마지막노드의 next가 매번 새로운 노드를 가리킬수있도록 해야함!
	N *p = root;
	while (p->next != NULL) { // 마지막노드를 찾기위해 [p->next] 작성!!!
		if (p->next->data == data) {
			printf("%d는 이미 존재합니다.\n", data);
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

	printf("%d는 존재하지않는 데이터입니다.\n", data);

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
		printf("1.삽입 2.삭제 3.출력 4.종료\n");
		printf("번호입력: ");
		scanf("%d", &act);
		if (act == 1) {
			int data;
			printf("데이터입력: ");
			scanf("%d", &data);
			add(head, data);
		}
		else if (act == 2) {
			int data;
			printf("데이터입력: ");
			scanf("%d", &data);
			nodeRemove(head, data);
		}
		else if (act == 3) {
			show(head);
		}
		else {
			printf("프로그램종료\n");
			break;
		}
	}

	return 0;
}