// 리스트를 이용한 큐 구현
#include <stdio.h>
#include <stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;

// front point와 rear point는 필수
typedef struct Queue {
	N* front;
	N* rear;
	int size;	// 필수는 아니지만 
				// 기존에 큐 배열에서 사용한 인덱스로 관리하지 않기 때문에 사이즈 파악이 어려움
				// 때문에 관리용으로 size를 만들면 편리함
}Q;

void Enqueue(Q* q, int data) {
	N* n = (N*)malloc(sizeof(N));
	n->data = data;
	n->next = NULL;

	if (q->size == 0) {	// 큐가 비어있다면,
						// 맨 앞을 현재 만든 노드로 설정!
						// front는 삭제하면서 변경사항은 있을 수 있으나 
						// 삽입할 때 front 설정은 한 번만 설정

		q->front = n;
	}
	else {
		q->rear->next = n;	// 연결리스트
	}
	q->rear = n;
	q->size++;
}

int Dequeue(Q* q) {
	// int data = q->front->data;에서 바로 return 하지 않은 이유는
	// front를 변경해야 하기 때문(return하면 바로 함수가 종료됨)
	int data = q->front->data;	// 어떤 것을 삭제할지 사용자에게 출력해야 하기 때문에 return 값으로 준다
	q->front = q->front->next;	// front값을 next로 옮기는 것 자체가 리스트 특성상 삭제를 의미
	q->size--;	// 삭제를 했기 때문에 size 값을 감소시키는 것임
				// size 값은 데이터의 개수이기 때문

	return data;
}

void roll(Q* q) {
	// 10 -> 20 -> 30 => 20 -> 30 -> 10
	// 30을 10을 가리키게 하면 빙글 빙글 계속 반복된다 => 10 -> 20 -> 30 -> 10 -> 20 -> 30 -> ... 
	// 이때 10과 20을 끊는다 => 10 뚝 20 -> 30 -> 10 뚝 20 -> 30 -> ...
	q->rear->next = q->front;
	q->rear = q->rear->next;

	q->front = q->front->next;
	q->rear->next = NULL;
}

int main() {

	// 큐를 사용하기 위한 반드시 해야하는 사전 준비
	// front와 rear는 반드시 있어야하기 때문에
	Q q;
	q.size = 0;
	q.front = NULL;
	q.rear = NULL;

	// 실질적으로 큐 액션을 하는 곳
	int act;
	while (1) {
		printf("1.삽입 2.삭제 3.출력 4.회전 5.종료\n");
		scanf("%d", &act);

		if (act == 1) {
			int data;
			scanf("%d", &data);

			// 메인에 직접적으로 변화를 줘야 하기 때문에 주소를 전달하는 것임
			Enqueue(&q, data);
		}
		else if (act == 2) {
			if (q.size == 0) {
				printf("텅 빔\n");
				continue;
			}
			printf("Dequeue() : %d\n", Dequeue(&q));
		}
		else if (act == 3) {
			// 빙글 빙글 돌아야 한다...
			// 즉, 순회용 포인터가 필요
			N* p = q.front;

			// 중요한 점! 리스트를 이용한 큐는 isFull이 없음..!!
			while (p != NULL) {
				printf("%d ", p->data);
				p = p->next;
			}
			printf("\n");
		}
		else if (act == 4) {
			// 회전 : 10 -> 20 -> 30 회전 후 20 -> 30 -> 10
			// 포인터들을 오른쪽으로 이동하여 데이터를 왼쪽으로 이동하는 효과
			
			// 10->20->30
			roll(&q);
			// 20->30->10
			printf("회전완료\n");
		}
		else {
			break;
		}
	}
}