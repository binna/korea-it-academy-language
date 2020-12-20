// ����Ʈ�� �̿��� ť ����
#include <stdio.h>
#include <stdlib.h>

typedef struct NODE {
	int data;
	struct NODE* next;
}N;

// front point�� rear point�� �ʼ�
typedef struct Queue {
	N* front;
	N* rear;
	int size;	// �ʼ��� �ƴ����� 
				// ������ ť �迭���� ����� �ε����� �������� �ʱ� ������ ������ �ľ��� �����
				// ������ ���������� size�� ����� ����
}Q;

void Enqueue(Q* q, int data) {
	N* n = (N*)malloc(sizeof(N));
	n->data = data;
	n->next = NULL;

	if (q->size == 0) {	// ť�� ����ִٸ�,
						// �� ���� ���� ���� ���� ����!
						// front�� �����ϸ鼭 ��������� ���� �� ������ 
						// ������ �� front ������ �� ���� ����

		q->front = n;
	}
	else {
		q->rear->next = n;	// ���Ḯ��Ʈ
	}
	q->rear = n;
	q->size++;
}

int Dequeue(Q* q) {
	// int data = q->front->data;���� �ٷ� return ���� ���� ������
	// front�� �����ؾ� �ϱ� ����(return�ϸ� �ٷ� �Լ��� �����)
	int data = q->front->data;	// � ���� �������� ����ڿ��� ����ؾ� �ϱ� ������ return ������ �ش�
	q->front = q->front->next;	// front���� next�� �ű�� �� ��ü�� ����Ʈ Ư���� ������ �ǹ�
	q->size--;	// ������ �߱� ������ size ���� ���ҽ�Ű�� ����
				// size ���� �������� �����̱� ����

	return data;
}

void roll(Q* q) {
	// 10 -> 20 -> 30 => 20 -> 30 -> 10
	// 30�� 10�� ����Ű�� �ϸ� ���� ���� ��� �ݺ��ȴ� => 10 -> 20 -> 30 -> 10 -> 20 -> 30 -> ... 
	// �̶� 10�� 20�� ���´� => 10 �� 20 -> 30 -> 10 �� 20 -> 30 -> ...
	q->rear->next = q->front;
	q->rear = q->rear->next;

	q->front = q->front->next;
	q->rear->next = NULL;
}

int main() {

	// ť�� ����ϱ� ���� �ݵ�� �ؾ��ϴ� ���� �غ�
	// front�� rear�� �ݵ�� �־���ϱ� ������
	Q q;
	q.size = 0;
	q.front = NULL;
	q.rear = NULL;

	// ���������� ť �׼��� �ϴ� ��
	int act;
	while (1) {
		printf("1.���� 2.���� 3.��� 4.ȸ�� 5.����\n");
		scanf("%d", &act);

		if (act == 1) {
			int data;
			scanf("%d", &data);

			// ���ο� ���������� ��ȭ�� ��� �ϱ� ������ �ּҸ� �����ϴ� ����
			Enqueue(&q, data);
		}
		else if (act == 2) {
			if (q.size == 0) {
				printf("�� ��\n");
				continue;
			}
			printf("Dequeue() : %d\n", Dequeue(&q));
		}
		else if (act == 3) {
			// ���� ���� ���ƾ� �Ѵ�...
			// ��, ��ȸ�� �����Ͱ� �ʿ�
			N* p = q.front;

			// �߿��� ��! ����Ʈ�� �̿��� ť�� isFull�� ����..!!
			while (p != NULL) {
				printf("%d ", p->data);
				p = p->next;
			}
			printf("\n");
		}
		else if (act == 4) {
			// ȸ�� : 10 -> 20 -> 30 ȸ�� �� 20 -> 30 -> 10
			// �����͵��� ���������� �̵��Ͽ� �����͸� �������� �̵��ϴ� ȿ��
			
			// 10->20->30
			roll(&q);
			// 20->30->10
			printf("ȸ���Ϸ�\n");
		}
		else {
			break;
		}
	}
}