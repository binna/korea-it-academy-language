// �迭�� �̿��Ͽ� ���� �����ϱ�
#include <stdio.h>
#define MAX 5

int stack[MAX];
int index = -1;	// �ε����� 0��°���� �����ϱ� ������ -1�� index�� ����
						// å�� ����, ��Ȳ�� ���� index �������� �ٸ� �� �ִ�

int isFull() {
	if (index == MAX - 1) {	// MAX-1�� �ϴ� ������ �˻� �� �����ؾ��ϱ� ������
										// MAX�� �Ѵٸ� �̹� �� �� ���¿��� ������ �Ϸ��� �ϱ� ������ ������ ����
		return 1;	// ������ ������ ���� �� 1�� ����!
	}
	return 0;
}
void push(int data) {
	if (isFull()) {		// ������ �Ʒ��� �б� ������ push���� ���� isFull �Լ��� �־�� ��
		printf("�������� �Է� �Ұ��մϴ�!\n");
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
		printf("1. push() 2. pop() 3. peek() 4. size() 5. ����\n");
		printf("��ȣ �Է� : ");
		scanf("%d", &act);

		if (act == 1) {
			// �����͸� ���ÿ� �Է��ϴ� �׼�

			if (isFull()) {
				// �����͸� �Է��ϱ⵵ ���� �� �� �ִٴ� ���â�� �Բ�
				// �Է��� ��ŵ�ϰ� �ʹٸ�
				// ���⿡ isFull�ϸ� �ȴ�
				printf("�������� �Է� �Ұ��մϴ�!\n");
				continue;
			}

			printf("������ �Է� : ");
			int data;
			scanf("%d", &data);
			push(data);
		}
		else if (act == 2) {

		}
		else if (act == 3) {

		}
		else if (act == 4) {
			// ���ÿ� ����ִ� �������� ����
			// ����, LEVEL, ����
			printf("������ ������ %d�� �Դϴ�.\n", size());
		}
		else {
			printf("����\n");
			break;
		}
	}

	return 0;
}