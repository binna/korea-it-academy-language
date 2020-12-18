#include<stdio.h>
#include<stdlib.h>

void bubble_sort(int* arr, int n) {
	for (int a = 0; a < n; a++) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
			}
		}
		// 정렬하는 과정 보여주기
		for (int i = 0; i < n; i++) {
			printf("%d ", arr[i]);
		}
		printf("\n");
	}
}

int main() {

	int n;
	printf("몇 개의 배열을 만들지 숫자를 입력 : ");
	scanf("%d", &n);
	int* arr = (int*)malloc(n * sizeof(int));

	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}

	printf("정렬전 : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	// 버블 정렬 실행
	bubble_sort(arr, n);

	printf("정렬후 : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}