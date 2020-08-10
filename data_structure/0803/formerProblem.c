#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void swap(int* arr, int a, int b) {
	int tmp = arr[a];
	arr[a] = arr[b];
	arr[b] = tmp;
}
void quick_sort(int* arr, int start, int end) {
	int pivot = arr[start];
	int l = start + 1;
	int r = end;

	while (l <= r) {
		while (arr[l] < pivot) {
			l++;
		}
		while (arr[r] > pivot) {
			r--;
		}
		if (l <= r) {
			swap(arr, l, r);
		}
	}

	if (start < end) {	// 요소가 1개가 될 때까지 반복
		swap(arr, start, r);
		quick_sort(arr, start, r - 1);
		quick_sort(arr, r + 1, end);
	}
}

int main() {
	srand(time(NULL));
	int arr[10];
	for (int i = 0; i < 10; i++) {
		arr[i] = rand() % 100 + 1;
	}
	for (int i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}

	printf("\n"); 
	quick_sort(arr, 0, 9);
	for (int i = 0; i < 10; i++) {
		printf("%d", arr[i]);
	}

	printf("\n");
	int index = rand() % 10;
	printf("[%d] -> %d를 맞추자!\n", index, arr[index]);

	int start = index == 0 ? 1 : arr[index - 1];
	int end = index == 9 ? 100 : arr[index + 1];
	int cnt = 0;

	while (1) {
		printf("%d ~ %d : ", start, end);
		int n;
		scanf("%d", &n);
		if (start > n || n > end) {
			printf("[올바르게 입력하세요!]\n");
			continue;
		}
		cnt++;
		if (n == arr[index]) {
			break;
		}
		else if (arr[index] > n) {
			start = n + 1;
		}
		else {
			end = n - 1;
		}
	}
	printf("%d번 소요됨!\n", cnt);

	return 0;
}