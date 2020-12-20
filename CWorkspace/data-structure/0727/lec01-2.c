// �δ콺 ������ 0�϶� ���� ���� �����
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
		printf("1.push() 2.pop() 3.peek() 4.size() 5.����\n");
		printf("��ȣ �Է� : ");
		scanf("%d", &act);

		// ������ �߰�
		if (act == 1) {
			printf("������ �Է� : ");
			int data;
			scanf("%d", &data);
			push(data);
		}

		// ���� ���� ���� ����
		else if (act == 2) {
			if (isEmpty()) {
				printf("�� �� ��� �Ұ�!\n");
				continue;
			}
			printf("pop() ���� %d\n", pop());
		}

		// ���� ���� ���� ��ȯ
		else if (act == 3) {
			if (isEmpty()) {
				printf("�� �� ��� �Ⱑ\n");
				continue;
			}
			printf("peek() ���� %d\n", peek());
		}

		// ������ ����
		else if (act == 4) {
			printf("������ ������ %d�� �Դϴ�\n", size());
		}

		// ���α׷� ����
		else {
			printf("����\n");
			break;
		}
	}

	return 0;
}