#include<stdio.h>
#include<stdlib.h>

/*
	���� 1�� ž�� ����
	ž : int �ݾ�, int ����
	�ݾ� X ���� = ž�� ���鶧 ���Ǵ� �� �ݾ�
	���� ��� ���
*/

typedef struct TOP {
	int money;
	int height;
}TOP;

int main() {
	int N;
	scanf("%d", &N);

	TOP* top = (TOP*)malloc(N * sizeof(TOP));

	int totalMoney = 0;

	for (int i = 0; i < N; i++) {
		printf("�ݾװ� ���̸� �Է� : ");
		scanf("%d%d", &top[i].money, &top[i].height);
		totalMoney += top[i].money * top[i].height;
	}
	printf("%d\n", totalMoney);

	return 0;
}