#include<stdio.h>
#include<stdlib.h>

typedef struct Student {
	char name[10];
	int score;
	int num;
}S;

int main() {
	// �����Ҵ�����!!!
	int N;
	scanf("%d", &N);
	S *s = (S *)malloc(N * sizeof(S));
	for (int i = 0; i < N; i++) {
		s[i].num = i + 1;
		printf("%d�� �л��� �̸��Է�: ", s[i].num);
		scanf("%s", s[i].name);
		printf("�����Է�: ");
		scanf("%d", &s[i].score);
	}

	int max = s[0].score;
	int maxIndex = 0;
	for (int i = 0; i < N; i++) {
		printf("%d�� �л��� �̸�: %s / ", s[i].num, s[i].name);
		printf("����: %d\n", s[i].score);
		if (max < s[i].score) {
			// [�ִ밪 ã��] �˰���
			max = s[i].score;
			maxIndex = i;
		}
	}
	printf("������ ���� �л��� %s �Դϴ�.\n", s[maxIndex].name);

	return 0;
}