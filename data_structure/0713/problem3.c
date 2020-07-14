#include<stdio.h>
#include<stdlib.h>

int main() {

	// 1. 이차원 배열 생성하기
	int a, b;
	scanf("%d %d", &a, &b);

	// 1)학생들 점수
	int** arr = (int**)malloc(a * sizeof(int*));
	for (int i = 0; i < a; i++) {
		arr[i] = (int*)malloc(b * sizeof(int));
	}

	// 2)합계, 평균
	int* sum = (int*)malloc(a * sizeof(int*));
	double* avg = (double*)malloc(a * sizeof(double*));

	// 2. 점수 입력 받기
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b; j++) {
			scanf("%d", &arr[i][j]);
		}
	}

	// 3. 각 학생별 합계 구하기
	for (int i = 0; i < a; i++) {
		sum[i] = 0;
		for (int j = 0; j < b; j++) {
			sum[i] += arr[i][j];
		}
		printf("sum[%d] = %d\n", i, sum[i]);
	}

	// 4. 각 학생별 평균 구하기
	for (int i = 0; i < a; i++) {
		avg[i] = sum[i] / (double)b;
	}

	// 5. 각 학생별 평균 출력하기
	for (int i = 0; i < a; i++) {
		printf("%.2f\t", avg[i]);
	}

	return 0;
}