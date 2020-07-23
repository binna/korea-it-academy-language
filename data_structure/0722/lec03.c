// 배열을 이용하여 스택 구현하기
#include <stdio.h>
#define MAX 5

int stack[MAX];
int index = -1;	// 인덱스는 0번째부터 시작하기 때문에 -1을 index에 저장
						// 책에 따라, 상황에 따라 index 시작점은 다를 수 있다

int isFull() {
	if (index == MAX - 1) {	// MAX-1을 하는 이유는 검사 후 저장해야하기 때문에
										// MAX로 한다면 이미 꽉 찬 상태에서 저장을 하려고 하기 때문에 문제가 생김
		return 1;	// 스택이 가득차 있을 때 1을 리턴!
	}
	return 0;
}
void push(int data) {
	if (isFull()) {		// 위에서 아래로 읽기 때문에 push보다 위에 isFull 함수가 있어야 함
		printf("가득차서 입력 불가합니다!\n");
		return;
	}
	index++;
	stack[index] = data;
}
int size() {
	return index + 1;
}

int main() {
	int act;

	while (1) {
		printf("1. push() 2. pop() 3. peek() 4. size() 5. 종료\n");
		printf("번호 입력 : ");
		scanf("%d", &act);

		if (act == 1) {
			// 데이터를 스택에 입력하는 액션

			if (isFull()) {
				// 데이터를 입력하기도 전에 꽉 차 있다는 경고창과 함께
				// 입력을 스킵하고 싶다면
				// 여기에 isFull하면 된다
				printf("가득차서 입력 불가합니다!\n");
				continue;
			}

			printf("데이터 입력 : ");
			int data;
			scanf("%d", &data);
			push(data);
		}
		else if (act == 2) {

		}
		else if (act == 3) {

		}
		else if (act == 4) {
			// 스택에 들어있는 데이터의 개수
			// 수위, LEVEL, 높이
			printf("데이터 개수는 %d개 입니다.\n", size());
		}
		else {
			printf("종료\n");
			break;
		}
	}

	return 0;
}