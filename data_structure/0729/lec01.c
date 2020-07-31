// ť�� �����Ҷ� �迭�� �����ϴ� ����� ����Ʈ�� �����ϴ� ����� ����

// ť : FIFO ���Լ��� ����� ������ ����
// �迭�� ť �����ϱ�
#include <stdio.h>
#define MAX 5
int queue[MAX];

// ť���� start point, end point�� �ݵ�� �ʿ���
int s = 0;
int e = 0;

int isFull() {
	if (s == e && queue[s] != 0) {
		return 1;		// �����Ͱ� ���� �� ��Ȳ
	}
	return 0;
}
int isEmpty() {
	if (s == e && queue[s] == 0) {
		return 1;		// �����Ͱ� ���� ��Ȳ
	}
	return 0;
}

// �����͸� �Է��ϴ� �Լ�
void Enqueue(int data) {
	queue[e++] = data;
	if (e == MAX) {
		e = 0; // ȸ��ť
	}
}

// �����͸� ����ϴ� �Լ�
void Dequeue() {
	printf("Dequeue() : %d\n", queue[s]);
	queue[s++] = 0;	// isFull() vs isEmpty()
	if (s == MAX) {
		s = 0;
	}
}

int size() {
	if (isEmpty()) {	// �� ��� �ִ�?, �� ��� ������ ������ 0
		return 0;
	}
	else if (isFull()) {	// Ȥ�� �� á��?, �� �������� ������ MAX
		return MAX;
	}
	else {
		if (e - s < 0) {
			// start ���� �� ū ���
			// ��) 0 0 3 4 5 -> start 5, end 3 -> �� 3���� ������(3 - 5 + 5)
			return e - s + MAX;
		}
		else {
			// end ���� �� ū ���
			// end - start�ϸ� ������ ������ �� �� ����
			// ��) 1 2 3 0 0 -> start 1, end 4 -> �� 3���� ������(4 - 1)
			return e - s;
		}
	}
}
void show() {
	// 1. size ���ϱ� : �󸶸�ŭ �����Ͱ� ��� �ִ��� Ȯ���� �ʿ�
	int index = s;
	for (int i = 0; i < size(); i++) {
		// 2. s���� ���
		printf("%d ", queue[index++]);

		if (index == MAX) {		// 3. MAX ���޽� [0]���� �̵���Ű��
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
		printf("1.Enqueue() 2.Dequeue() 3.show() 4.����\n");
		scanf("%d", &act);
		if (act == 1) {
			if (isFull()) {
				printf("������\n");
				continue;
			}
			printf("�����Է�: ");
			int data;
			scanf("%d", &data);
			Enqueue(data);
		}
		else if (act == 2) {
			if (isEmpty()) {
				printf("�ֺ�\n");
				continue;
			}
			Dequeue();
		}
		else if (act == 3) {
			printf("show()ȣ��: ");
			show();
			printf("\n");
		}
		else {
			printf("����\n");
			break;
		}
	}

	return 0;
}