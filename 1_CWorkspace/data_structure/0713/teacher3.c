#include<stdio.h>
#include<stdlib.h>
int main() {

	// 다차원배열==이차원배열 -> 동적할당
	int a, b;
	scanf("%d%d", &a, &b);
	int **arr = (int **)malloc(a * sizeof(int *));
	for (int i = 0; i < a; i++) {
		arr[i] = (int *)malloc(b * sizeof(int));
	}
	// 이차원배열 생성완료
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b; j++) {
			scanf("%d", &arr[i][j]);
		}
	}
	for (int i = 0; i < a; i++) {
		printf("%d번 학생의 평균은 ", i + 1);
		int sum = 0;
		for (int j = 0; j < b; j++) {
			sum += arr[i][j];
		}
		printf("%.2lf점 입니다.\n", sum*1.0 / b);
	}

	return 0;
}