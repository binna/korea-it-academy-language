#pragma once
#include<stdio.h>

typedef struct student {
	int num;	// 1001������ ���������� ����
	char name[20];
	int s1;
	int s2;
	double avg;
}S;

void inputScores(S* sp) { // �ּҰ��� ���ڷ� �ޱ� ���� ǥ���� �ʿ� -> �� ��ȭ �߻�
	printf("�߰���� ���� �Է� : ");
	scanf("%d", &sp->s1);
	printf("�⸻��� ���� �Է� : ");
	scanf("%d", &sp->s2);
	sp->avg = (sp->s1 + sp->s2) / 2.0;
}

void inputS(S* sp, int index) {	// �ּҰ��� ���ڷ� �ޱ� ���� ǥ���� �ʿ�! -> �� ��ȭ �߻�
	sp->num = 1000 + index;
	printf("%d���� �л� �̸� �Է� : ", sp->num);
	scanf("%s", sp->name);
	inputScores(sp);
}

void show(S sp) {
	printf("%d. %s�� ������ %.2lf���Դϴ�.\n", sp.num, sp.name, sp.avg);
}