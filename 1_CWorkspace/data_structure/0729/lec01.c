// 큐를 구현할때 배열로 구현하는 방법과 리스트로 구현하는 방법이 있음

// 큐 : FIFO 선입선출 방식의 데이터 구조
// 배열로 큐 구현하기
#include <stdio.h>
#define MAX 5
int queue[MAX];

// 큐에는 start point, end point가 반드시 필요함
int s = 0;
int e = 0;

int isFull() {
	if (s == e && queue[s] != 0) {
		return 1;		// 데이터가 가득 찬 상황
	}
	return 0;
}
int isEmpty() {
	if (s == e && queue[s] == 0) {
		return 1;		// 데이터가 없는 상황
	}
	return 0;
}

// 데이터를 입력하는 함수
void Enqueue(int data) {
	queue[e++] = data;
	if (e == MAX) {
		e = 0; // 회전큐
	}
}

// 데이터를 출력하는 함수
void Dequeue() {
	printf("Dequeue() : %d\n", queue[s]);
	queue[s++] = 0;	// isFull() vs isEmpty()
	if (s == MAX) {
		s = 0;
	}
}

int size() {
	if (isEmpty()) {	// 텅 비어 있니?, 텅 비어 있으면 사이즈 0
		return 0;
	}
	else if (isFull()) {	// 혹시 꽉 찼니?, 꽉 차있으면 사이즈 MAX
		return MAX;
	}
	else {
		if (e - s < 0) {
			// start 값이 더 큰 경우
			// 예) 0 0 3 4 5 -> start 5, end 3 -> 총 3개의 데이터(3 - 5 + 5)
			return e - s + MAX;
		}
		else {
			// end 값이 더 큰 경우
			// end - start하면 데이터 개수를 알 수 있음
			// 예) 1 2 3 0 0 -> start 1, end 4 -> 총 3개의 데이터(4 - 1)
			return e - s;
		}
	}
}
void show() {
	// 1. size 구하기 : 얼마만큼 데이터가 들어 있는지 확인이 필요
	int index = s;
	for (int i = 0; i < size(); i++) {
		// 2. s부터 출력
		printf("%d ", queue[index++]);

		if (index == MAX) {		// 3. MAX 도달시 [0]으로 이동시키기
			index = 0;
		}
	}
}

int main() {

	for (int i = 0; i < MAX; i++) {
		queue[i] = 0;
	}	// isEmpty() vs isFull()

	int act;
	while (1) {
		printf("1.Enqueue() 2.Dequeue() 3.show() 4.종료\n");
		scanf("%d", &act);
		if (act == 1) {
			if (isFull()) {
				printf("가득참\n");
				continue;
			}
			printf("정수입력: ");
			int data;
			scanf("%d", &data);
			Enqueue(data);
		}
		else if (act == 2) {
			if (isEmpty()) {
				printf("텅빔\n");
				continue;
			}
			Dequeue();
		}
		else if (act == 3) {
			printf("show()호출: ");
			show();
			printf("\n");
		}
		else {
			printf("종료\n");
			break;
		}
	}

	return 0;
}