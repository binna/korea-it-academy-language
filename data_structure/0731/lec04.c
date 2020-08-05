#include<stdio.h>
#include<stdlib.h>

void swap(int* arr, int a, int b) {
	int tmp = arr[a];
	arr[a] = arr[b];
	arr[b] = tmp;
}
void quick_sort(int *arr, int start, int end) {
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
	if (start < end) { // ��Ұ� 1�����ɶ�����
		swap(arr, start, r);
		quick_sort(arr, start, r - 1);
		quick_sort(arr, r + 1, end);
	}
}

int main() {

	int n;
	printf("�� ���� �迭�� ������ ���ڸ� �Է� : ");
	scanf("%d", &n);
	int* arr = (int*)malloc(n * sizeof(int));

	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}

	printf("������ : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	// �� ���� ����
	quick_sort(arr, 0, n - 1);

	printf("������ : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}