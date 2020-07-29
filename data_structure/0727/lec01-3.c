// ���� �Ҵ��� �̿��� ���� ����
#include <stdio.h>
#include <stdlib.h>

void push(int data, int* stack, int index) {
	stack[index] = data;
}

int main() {
	printf("������ ũ�⸦ �Է��ϼ��� : ");
	int num;
	scanf("%d", &num);

	int* stack = (int*)malloc(num * sizeof(int));
	int index = 0;

	int act;
	while (1) {
		printf("1.push() 2. pop 3.peek 4.size 5.����\n");

		printf("��ȣ �Է� : ");
		scanf("%d", &act);
		if (act == 1) {
			if (index == num) {
				printf("�������� �Է� �Ұ�\n");
				continue;
			}
			printf("������ �Է� : ");
			int data;
			scanf("%d", &data);
			push(data, stack, index);
			index++;
		}
		else if (act == 2) {
			if (index == 0) {
				printf("�� �� ��� �Ұ�\n");
				continue;
			}
			printf("pop ���� %d\n", stack[--index]);
		}
		else if (act == 3) {
			if (index == 0) {
				printf("�� �� ��� �Ұ�\n");
				continue;
			}
			printf("peek ���� %d\n", stack[index - 1]);
		}
		else if (act == 4) {
			printf("�������� ������ %d�� �Դϴ�\n", index);
		}
		else {
			printf("����\n");
			break;
		}
	}

	return 0;
}