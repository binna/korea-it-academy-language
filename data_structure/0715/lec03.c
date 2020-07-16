#include <stdio.h>
#include <stdlib.h>
/*
	���� 1�� -> �л� ����ü �迭
	int s1, int s2�� ����� ����
	�л��� ��� ������ �Ҽ��� �� ��°�ڸ����� ���
	����� show��� �Լ��� �̿��Ͽ� ���
*/

// 2. �л� ����ü�� �����
typedef struct STUDENT {
	int s1;
	int s2;
}STU;

// 5. ��� show() �Լ� �����
// �л��� ��� ������ �Ҽ��� �� ��°�ڸ����� ���
void show(STU* student, int N) {
	int* sum = (int*)malloc(N * sizeof(int));

	for (int i = 0; i < N; i++) {
		printf("%.2lf\n", (double)(student[i].s1 + student[i].s2) / N);
	}

}
int main() {
	// 1. ���� 1���� �Է¹޴´�.
	int N;
	scanf("%d", &N);

	// 3. �Էµ� ������ �̿�, ���� �迭 �����
	STU* student = (STU*)malloc(N * sizeof(STU));

	// 4. �л��� ���� �ޱ�
	for (int i = 0; i < N; i++) {
		printf("%d��° �л� ���� �Է� : ", i + 1);
		scanf("%d%d", &student[i].s1, &student[i].s2);
	}

	// 6. �Լ� ����
	show(student, N);

	return 0;
}