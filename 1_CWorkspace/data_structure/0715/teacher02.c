#include<stdio.h>
#include<stdlib.h>

typedef struct Student {
	char name[10];
	int score;
	int num;
}S;

int main() {
	// 동적할당적용!!!
	int N;
	scanf("%d", &N);
	S *s = (S *)malloc(N * sizeof(S));
	for (int i = 0; i < N; i++) {
		s[i].num = i + 1;
		printf("%d번 학생의 이름입력: ", s[i].num);
		scanf("%s", s[i].name);
		printf("성적입력: ");
		scanf("%d", &s[i].score);
	}

	int max = s[0].score;
	int maxIndex = 0;
	for (int i = 0; i < N; i++) {
		printf("%d번 학생의 이름: %s / ", s[i].num, s[i].name);
		printf("성적: %d\n", s[i].score);
		if (max < s[i].score) {
			// [최대값 찾기] 알고리즘
			max = s[i].score;
			maxIndex = i;
		}
	}
	printf("성적이 높은 학생은 %s 입니다.\n", s[maxIndex].name);

	return 0;
}