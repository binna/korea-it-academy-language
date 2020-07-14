#include<stdio.h>
#include<stdlib.h>

int main() {

	int n;
	scanf("%d", &n);
	int* arr = (int*)malloc(n * sizeof(int));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}

	int cnt;
	int sum = 0;
	for (int i = 0; i < n; i++) {
		cnt = 0;
		for (int j = i + 1; j < n; j++) {
			cnt++;
			if (arr[i] < arr[j]) { break; }
		}
		sum += cnt;
		printf("%d %d\n", cnt, sum);
	}
	printf("%d", sum);

	return 0;
}