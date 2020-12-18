#include <stdio.h>
#define MAX 5

int stack[MAX];
int index = -1;	// �ε����� 0��°���� �����ϱ� ������ -1�� index�� ����
						// å�� ����, ��Ȳ�� ���� index �������� �ٸ� �� �ִ�

int isFull() {
	if (index == MAX - 1) {	// MAX-1�� �ϴ� ������ �˻� �� �����ؾ��ϱ� ������
										// MAX�� �Ѵٸ� �̹� �� �� ���¿��� ������ �Ϸ��� �ϱ� ������ ������ ����
		return 1;					// ������ ������ ���� �� 1�� ����!
	}
	return 0;
}
void push(int data) {
	index++;
	stack[index] = data;
}

int isEmpty() {
	if (index < 0) {	// index�� 0���� �۴ٴ� ���� �����Ͱ� ���ٴ� ��
							// ����� �����Ͱ� ���� ���¿��� �����Ѵٸ� ������ ����
		return 1;		// ������ �� ��� ���� �� 1�� ����
	}
	return 0;
}
int pop() {
	// ����Ű�� �ִ� �����͸� ��� �� index - 1�� ����� �Ѵ�.
	// index - 1�� �ǹ�? �� �����͸� �����Ѵٴ� ��..!!
	// �׷��� ������ ���� �����ڰ� �����ϴ�.
	return stack[index--];
}

// ���� ���� ���� ����
int peek() {
	return stack[index];
}

// ������ ����
int size() {
	return index + 1;
}

int main() {
	int act;

	while (1) {
		printf("1.push() 2.pop() 3.peek() 4.size() 5.����\n");
		printf("��ȣ �Է� : ");
		scanf("%d", &act);

		// �����͸� ���ÿ� �Է��ϴ� �׼�
		if (act == 1) {
			if (isFull()) {
				printf("�������� �Է� �Ұ�\n");
				continue;
			}
			printf("������ �Է� : ");
			int data;
			scanf("%d", &data);
			push(data);
		}

		// ���� ���� ���� ����
		else if (act == 2) {
			if (isEmpty()) {
				printf("�� �� ��� �Ұ�\n");
				continue;
			}
			printf("pop() ���� %d\n", pop());
		}

		// ���� ���� ���� ��ȯ
		else if (act == 3) {
			if (isEmpty()) {
				printf("�� �� ��� �Ұ�\n");
				continue;
			}
			printf("peek() ���� %d\n", peek());
		}

		// ���ÿ� ����ִ� �������� ����
		// ����, LEVEL, ����
		else if (act == 4) {
			printf("������ ������ %d�� �Դϴ�.\n", size());
		}

		// ���α׷� ����
		else {
			printf("����\n");
			break;
		}

	} // end while()

	return 0;
}