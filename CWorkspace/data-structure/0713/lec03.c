#include<stdio.h>
#include<stdlib.h>
int main() {
	// [대용량데이터]를 효과적으로 [탐색]하기 위해서,
	// [정렬]해 보관해야한다!

	int n;
	scanf("%d", &n);
	int *arr = (int *)malloc(n * sizeof(int));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	// 버블정렬
	for (int a = 0; a < n; a++) {
		for (int x = 0; x < n - 1; x++) {
			// [비교]는 [데이터개수-1]번 수행됨!!!
			if (arr[x] > arr[x + 1]) {
				int tmp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = tmp;
			}
		}
		for (int i = 0; i < n; i++) {
			printf("%d ", arr[i]);
		}
		printf("\n");
	}
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;

}