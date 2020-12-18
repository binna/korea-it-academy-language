#pragma once
#include<stdio.h>

typedef struct student {
	int num;	// 1001번부터 순차적으로 지급
	char name[20];
	int s1;
	int s2;
	double avg;
}S;

void inputScores(S* sp) { // 주소값을 인자로 받기 위한 표인터 필요 -> 값 변화 발생
	printf("중간고사 점수 입력 : ");
	scanf("%d", &sp->s1);
	printf("기말고사 점수 입력 : ");
	scanf("%d", &sp->s2);
	sp->avg = (sp->s1 + sp->s2) / 2.0;
}

void inputS(S* sp, int index) {	// 주소값을 인자로 받기 위한 표인터 필요! -> 값 변화 발생
	sp->num = 1000 + index;
	printf("%d번의 학생 이름 입력 : ", sp->num);
	scanf("%s", sp->name);
	inputScores(sp);
}

void show(S sp) {
	printf("%d. %s의 성적은 %.2lf점입니다.\n", sp.num, sp.name, sp.avg);
}