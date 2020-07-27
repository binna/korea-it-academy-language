#include <stdio.h>
#define MAX 5

int stack[MAX];
int index = -1;	// 인덱스는 0번째부터 시작하기 때문에 -1을 index에 저장
						// 책에 따라, 상황에 따라 index 시작점은 다를 수 있다

int isFull() {
	if (index == MAX - 1) {	// MAX-1을 하는 이유는 검사 후 저장해야하기 때문에
										// MAX로 한다면 이미 꽉 찬 상태에서 저장을 하려고 하기 때문에 문제가 생김
		return 1;					// 스택이 가득차 있을 때 1을 리턴!
	}
	return 0;
}
void push(int data) {
	index++;
	stack[index] = data;
}

int isEmpty() {
	if (index < 0) {	// index가 0보다 작다는 것은 데이터가 없다는 뜻
							// 저장된 데이터가 없는 상태에서 삭제한다면 문제가 생김
		return 1;		// 스택이 텅 비어 있을 때 1을 리턴
	}
	return 0;
}
int pop() {
	// 가리키고 있는 데이터를 출력 후 index - 1을 해줘야 한다.
	// index - 1의 의미? 그 데이터를 삭제한다는 뜻..!!
	// 그렇기 때문에 후취 연산자가 적합하다.
	return stack[index--];
}

// 가장 위의 값을 삭제
int peek() {
	return stack[index];
}

// 데이터 개수
int size() {
	return index + 1;
}

int main() {
	int act;

	while (1) {
		printf("1.push() 2.pop() 3.peek() 4.size() 5.종료\n");
		printf("번호 입력 : ");
		scanf("%d", &act);

		// 데이터를 스택에 입력하는 액션
		if (act == 1) {
			if (isFull()) {
				printf("가득차서 입력 불가\n");
				continue;
			}
			printf("데이터 입력 : ");
			int data;
			scanf("%d", &data);
			push(data);
		}

		// 가장 위의 값을 삭제
		else if (act == 2) {
			if (isEmpty()) {
				printf("텅 비어서 출력 불가\n");
				continue;
			}
			printf("pop() 수행 %d\n", pop());
		}

		// 가장 위의 값을 반환
		else if (act == 3) {
			if (isEmpty()) {
				printf("텅 비어서 출력 불가\n");
				continue;
			}
			printf("peek() 수행 %d\n", peek());
		}

		// 스택에 들어있는 데이터의 개수
		// 수위, LEVEL, 높이
		else if (act == 4) {
			printf("데이터 개수는 %d개 입니다.\n", size());
		}

		// 프로그램 종료
		else {
			printf("종료\n");
			break;
		}

	} // end while()

	return 0;
}