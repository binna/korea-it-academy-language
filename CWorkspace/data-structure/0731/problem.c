#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	// 1. �������� ���� 10�� ����
	int number[10];
	srand(time(NULL));
	for (int i = 0; i < 10; i++) {
		// 2. �迭�� �ְ� ���
		number[i] = rand() % 100 + 1;
		printf("%d ", number[i]);
	}

	printf("\n");
	// 3. �������� �����ϰ� ��� -> �˰��� ���
	for (int i = 0; i < 10; i++) {
		for (int i = 0; i < 10 - 1; i++) {
			if (number[i] > number[i + 1]) {
				int temp = number[i];
				number[i] = number[i + 1];
				number[i + 1] = number[i];
			}
		}
	}
	for (int i = 0; i < 10; i++) {
		printf("%d ", number[i]);
	}

	printf("\n");
	// 4. 0 ~ 9 �߿� �������� ����, �ش� ���ڸ� ���纸��
	int n = rand() % 9 + 1;
	printf("%d�� ���ߴ� ����..!!\n", number[n]);

	int cnt = 0;
	while (1) {
		cnt++;
		int num;
		printf("���ڸ� �Է� : ");
		scanf("%d", &num);

		if (num == number[n]) {
			printf("\n�����Դϴ�!!\n����� %d�� ���� ������ ������ϴ�.\n\n", cnt);
			break;
		}
	}

	return 0;
}