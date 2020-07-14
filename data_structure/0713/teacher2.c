#include<stdio.h>
#include<stdlib.h>

int main() {

	int n;
	scanf("%d", &n);
	int *arr = (int *)malloc(n * sizeof(int));
	int sw = 0;
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
		if (arr[i] < 0) {
			sw = 1;
		}
		if (i != 0 && arr[i] < arr[i - 1]) {
			// 인덱스 구간이 유효한지 확인!!!
			sw = 1;
		}
	}
	if (n < 2) {
		sw = 1;
	}
	if (sw) { // sw==1
		printf("ERROR!\n");
		return 0;
	}
	int min = arr[1] - arr[0]; // [최대값]알고리즘
	for (int i = 0; i < n - 1; i++) {
		if (min > arr[i + 1] - arr[i]) {
			min = arr[i + 1] - arr[i];
		}
	}
	printf("%d", min);

	return 0;
}