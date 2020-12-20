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
		// �����ϴ� ���� �����ֱ�
		for (int a = 0; a < n; a++) {
			printf("%d ", arr[a]);
		}
		printf("\n");
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

	// ���� ���� ����
	selection_sort(arr, n);

	printf("������ : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}