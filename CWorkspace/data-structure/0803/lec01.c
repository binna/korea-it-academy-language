#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// ���� ���� �Լ�
void select_sort(int* arr, int n) {
	for (int i = 0; i < n; i++) {
		int min = arr[i];
		int min_index = i;
		for (int j = i; j < n; j++) {
			if (min > arr[j]) {
				min = arr[j];
				min_index = j;
			}
		}
		int tmp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = tmp;
	}
}
// ����Ž�� == �̺�Ž��
int binarySearch(int* arr, int data, int start, int end) {
	int m = (start + end) / 2;

	while (start <= end) {
		if (arr[m] == data) {
			return m;
		}
		else if (arr[m] < data) {
			start = m + 1;
		}
		else {
			end = m - 1;
		}
		m = (start + end) / 2;
	}
	return -1;
}

int main() {
	// 1. 1~100���� ������ �� 10���� �迭�� ���
	srand(time(NULL));
	int arr[10];
	for (int i = 0; i < 10; i++) {
		arr[i] = rand() % 100 + 1;
	}
	for (int i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}

	// 2. ���� ������ �̿��Ͽ� ������������ ����
	printf("\n");
	select_sort(arr, 10);
	for(int i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}

	// 3. �� ���濡 �ִ��� ã���� �ϴ� ���� �Է� �ޱ�
	printf("\n");
	printf("ã�� ���� �Է� : ");
	int f;
	scanf("%d", &f);


	// 4. ���� Ž�� �̻��, �Է��� ������ �� �� ������ Ȯ��
	printf("\n����Ž�� �̻��\n");
	int sw = 0;	// ����ġOFF
	int i;
	for (i = 0; i < 10; i++) {
		if (arr[i] == f) {
			printf("[%d]\n", i);
			sw = 1;
			break;
		}
	}
	if (i == 10) {		// break ��� �� ���� ����
		printf("[-1]");
	}
	if (sw == 0) {
		printf("[-1]");
	}
	printf("\n\n");
	

	// 5. ����Ž�� ���, �Է��� ������ �� �� ������ Ȯ��
	// ����Ž��==�̺�Ž��
	printf("����Ž�� ���\n");
	printf("[%d]\n\n", binarySearch(arr, f, 0, 9));

	return 0;
}