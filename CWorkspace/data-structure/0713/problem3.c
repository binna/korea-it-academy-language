#include<stdio.h>
#include<stdlib.h>

int main() {

	// 1. ������ �迭 �����ϱ�
	int a, b;
	scanf("%d %d", &a, &b);

	// 1)�л��� ����
	int** arr = (int**)malloc(a * sizeof(int*));
	for (int i = 0; i < a; i++) {
		arr[i] = (int*)malloc(b * sizeof(int));
	}

	// 2)�հ�, ���
	int* sum = (int*)malloc(a * sizeof(int*));
	double* avg = (double*)malloc(a * sizeof(double*));

	// 2. ���� �Է� �ޱ�
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b; j++) {
			scanf("%d", &arr[i][j]);
		}
	}

	// 3. �� �л��� �հ� ���ϱ�
	for (int i = 0; i < a; i++) {
		sum[i] = 0;
		for (int j = 0; j < b; j++) {
			sum[i] += arr[i][j];
		}
		printf("sum[%d] = %d\n", i, sum[i]);
	}

	// 4. �� �л��� ��� ���ϱ�
	for (int i = 0; i < a; i++) {
		avg[i] = sum[i] / (double)b;
	}

	// 5. �� �л��� ��� ����ϱ�
	for (int i = 0; i < a; i++) {
		printf("%.2f\t", avg[i]);
	}

	return 0;
}