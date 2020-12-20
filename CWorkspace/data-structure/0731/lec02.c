#include<stdio.h>
#include<stdlib.h>

void insertion_sort(int* arr, int n) {
	for (int i = 1; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (arr[i] < arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
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
	insertion_sort(arr, n);

	printf("������ : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}