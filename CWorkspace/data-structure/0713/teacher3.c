#include<stdio.h>
#include<stdlib.h>
int main() {

	// �������迭==�������迭 -> �����Ҵ�
	int a, b;
	scanf("%d%d", &a, &b);
	int **arr = (int **)malloc(a * sizeof(int *));
	for (int i = 0; i < a; i++) {
		arr[i] = (int *)malloc(b * sizeof(int));
	}
	// �������迭 �����Ϸ�
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b; j++) {
			scanf("%d", &arr[i][j]);
		}
	}
	for (int i = 0; i < a; i++) {
		printf("%d�� �л��� ����� ", i + 1);
		int sum = 0;
		for (int j = 0; j < b; j++) {
			sum += arr[i][j];
		}
		printf("%.2lf�� �Դϴ�.\n", sum*1.0 / b);
	}

	return 0;
}