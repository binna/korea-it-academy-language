#include<stdio.h>
#include<stdlib.h>

void f1(int *arr, int len) {
	for (int i = len - 1; i >= 0; i--) {
		// [ p _ _ _ _ ]
		printf("%d ", *(arr + i));
	}
	printf("\n");
}
void f2(int *arr, int len) {
	for (int i = 0; i <= len - 1; i++) {
		// [ _ _ _ _ p ]
		printf("%d ", *(arr - i));
	}
	printf("\n");
}

int main() {
	int n;
	scanf("%d", &n);
	int *arr = (int *)malloc(n * sizeof(int));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	f1(&arr[0], n);	// arr==&arr[0]
							// [ _ _ _ _ _ ]
	f2(&arr[n - 1], n);

	return 0;
}