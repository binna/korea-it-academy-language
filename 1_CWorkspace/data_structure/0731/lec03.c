#include<stdio.h>
#include<stdlib.h>

void selection_sort(int *arr, int n) {
	for (int i = 0; i < n; i++) {
		int min = arr[i];
		int minIndex = i;
		for (int j = i; j < n; j++) {
			if (min > arr[j]) {
				min = arr[j];
				minIndex = j;
			}
		}
		int tmp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = tmp;
		// 정렬하는 과정 보여주기
		for (int a = 0; a < n; a++) {
			printf("%d ", arr[a]);
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

	// 선택 정렬 실행
	selection_sort(arr, n);

	printf("정렬후 : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}