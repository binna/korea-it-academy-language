// 인댁스 개수가 0일때 스택 구조 만들기
#include <stdio.h>
#define MAX 5
int stack[MAX];

int index = 0;

int isFull() {
	if (index == MAX) {
		return 1;
	}
	return 0;
}
void push(int data) {
	stack[index++] = data;
}

int isEmpty() {
	if (index - 1 < 0) {
		return 1;
	}
	return 0;
}
int pop() {
	return stack[--index];
}

int peek() {
	return stack[index - 1];
}

int size() {
	return index;
}

int main() {
	int act;

	while (1) {
		printf("1.push() 2.pop() 3.peek() 4.size() 5.종료\n");
		printf("번호 입력 : ");
		scanf("%d", &act);

		// 데이터 추가
		if (act == 1) {
			printf("데이터 입력 : ");
			int data;
			scanf("%d", &data);
			push(data);
		}

		// 가장 위의 값을 삭제
		else if (act == 2) {
			if (isEmpty()) {
				printf("텅 비어서 출력 불가!\n");
				continue;
			}
			printf("pop() 수행 %d\n", pop());
		}

		// 가장 위의 값을 반환
		else if (act == 3) {
			if (isEmpty()) {
				printf("텅 비어서 출력 출가\n");
				continue;
			}
			printf("peek() 수행 %d\n", peek());
		}

		// 데이터 개수
		else if (act == 4) {
			printf("데이터 개수는 %d개 입니다\n", size());
		}

		// 프로그램 종료
		else {
			printf("종료\n");
			break;
		}
	}

	return 0;
}