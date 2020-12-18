#include<stdio.h>
#include<stdlib.h>
#include<string.h>
/*
	3명의 학생 => 배열
	3명의 학생
	학생 구조체는 이름, 성적(int), 학생번호(int)
	3명의 학생 정보를 입력
	가장 성적이 높은 학생의 이름 출력하기
*/
typedef struct STUDENT {
	char name[10];
	int score;
	int stuNo;
}STU;

int main() {

	// 동적할당 적용
	int N;
	scanf("%d", &N);
	STU* student = (STU*)malloc(N * sizeof(STU));
	//STU student[3];

	for (int i = 0; i < 3; i++) {
		printf("%d번째 학생 이름, 점수, 번호 입력 : ", i + 1);
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