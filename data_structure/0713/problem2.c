#include<stdio.h>
#include<stdlib.h>

int main() {
	// 1. ��� �迭�� ���� ������ ����ڿ��� �Է� �ޱ�
	int n;
	scanf("%d", &n);

	// 7. ���� ����
	// ���ڰ� 2 �̻� �ƴϰų� �����϶� ERROR ���
	if (n >= 2) {
		// 2. �迭 ����� � ������ ä�� ������ ����ڿ��� �Է� �ޱ�
		int* arr = (int*)malloc(n * sizeof(int));
		for (int i = 0; i < n; i++) {
			scanf("%d", arr + i);
		}
		// 3. �Ÿ� ���ϴ� �� ������ �迭 �����
		// �Է¹����ͺ��� �ϳ� ���� �ֳ�? �Ÿ� ���ϸ� �ϳ� �Է� �����ͺ��� �ϳ� ������
		int* arDistance = (int*)malloc((n - 1) * sizeof(int));

		// 4. �Ÿ� ���ؼ� �迭�� �ֱ�
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					arDistance[i] = arr[i] - arr[j];
				}
				else {
					arDistance[i] = arr[j] - arr[i];
				}
			}
			//printf("%d", arDistance[i]);
		}

		// 5. ª�� �Ÿ� ���ϱ�
		// 0�� ���� �����ϰ� ������ ������ 1�������� ���� ��
		// ���� �� ������ �� ����
		int min = arDistance[0];
		for (int i = 0; i < n - 1; i++) {
			if (min > arDistance[i]) {
				min = arDistance[i];
			}
		}

		// 6. ����� ����ϱ�
		printf("%d\n", min);
	}
	else {
		printf("ERROR\n");
	}

	return 0;
}