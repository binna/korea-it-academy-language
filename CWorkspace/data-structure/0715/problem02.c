#include<stdio.h>
#include<stdlib.h>
#include<string.h>
/*
	3���� �л� => �迭
	3���� �л�
	�л� ����ü�� �̸�, ����(int), �л���ȣ(int)
	3���� �л� ������ �Է�
	���� ������ ���� �л��� �̸� ����ϱ�
*/
typedef struct STUDENT {
	char name[10];
	int score;
	int stuNo;
}STU;

int main() {

	// �����Ҵ� ����
	int N;
	scanf("%d", &N);
	STU* student = (STU*)malloc(N * sizeof(STU));
	//STU student[3];

	for (int i = 0; i < 3; i++) {
		printf("%d��° �л� �̸�, ����, ��ȣ �Է� : ", i + 1);
		scanf("%s%d%d", &student[i].name, &student[i].score, &student[i].stuNo);
	}

	int max = student[0].score;
	int index = 0;
	for (int i = 1; i < 3; i++) {
		if (max < student[i].score) {
			max = student[i].score;
			index = i;
		}
	}

	printf("%s %d\n", student[index].name, max);

	return 0;
}