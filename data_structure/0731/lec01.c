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
		// �����ϴ� ���� �����ֱ�
		for (int i = 0; i < n; i++) {
			printf("%d ", arr[i]);
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
	bubble_sort(arr, n);

	printf("������ : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}