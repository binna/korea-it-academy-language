#include<stdio.h>
#include<stdlib.h>
int main() {
	// [��뷮������]�� ȿ�������� [Ž��]�ϱ� ���ؼ�,
	// [����]�� �����ؾ��Ѵ�!

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
	// ��������
	for (int a = 0; a < n; a++) {
		for (int x = 0; x < n - 1; x++) {
			// [��]�� [�����Ͱ���-1]�� �����!!!
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