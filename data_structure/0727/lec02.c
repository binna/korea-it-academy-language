// action을 문자로 받는 스택 구현
#include<stdio.h>
#include<string.h>

#define MAX 5
int stack[MAX];

int index = -1;

int isFull() {
	if (index == MAX - 1) {
		return 1;
	}
	return 0;
}
int isEmpty() {
	if (index < 0) {
		return 1;
	}
	return 0;
}

void push(int data) {
	stack[++index] = data;
}
int pop() {
	return stack[index--];
}
int peek() {
	return stack[index];
}
int size() {
	return index + 1;
}

int main() {
	char act[10];
	
	while (1) {
		printf("push, pop, peek, size : ");
		scanf("%s", act);

		if (strcmp(act, "push") == 0) {
			int data;
			printf("데이터 입력 : ");
			scanf("%d", &data);
			if (isFull()) {
				printf("[가득차서 push불가!]\n");
				continue;
			}
			push(data);
		}
		else if (strcmp(act, "pop") == 0) {
			if (isEmpty()) {
				printf("[텅 비어서 pop 불가!]\n");
				continue;
			}
			printf("[%d]\n", pop());
		}
		else if (strcmp(act, "peek") == 0) {
			if (isEmpty()) {
				printf("[텅 비어서 peek 불가!]\n");
				continue;
			}
			printf("[%d]\n", peek());
		}
		else if (strcmp(act, "size") == 0) {
			printf("level : %d\n", size());
		}
		else {
			printf("\nBye...\n\n");
			break;
		}
	}
	return 0;
}