// 1. 삽입
// 2. 삭제
// + 없는 데이터 삭제 못하게 처리
// 3. 출력
// + 중복 없이 오름차순

#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;

void add(N *root, int data) {
	// 노드생성
	N *node = (N *)malloc(sizeof(N));
	node->data = data;
	node->next = NULL;

	// 노드 연결
	// 마지막노드의 next가 매번 새로운 노드를 가리킬수있도록 해야함!
	N *p = root;
	while (p->next != NULL) { // 마지막노드를 찾기위해 [p->next] 작성!!!
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

		}
		else if (act == 3) {

		}
		else {
			printf("프로그램종료\n");
			break;
		}
	}

	return 0;
}