#include<stdio.h>
#include<stdlib.h>

// 모듈화 프로그래밍
#include"studentFile.h"

int main() {

	printf("학생수 입력: ");
	int n;
	scanf("%d", &n);
	S* s = (S*)malloc(n * sizeof(S));
	// 학생 구조체 배열이 생성됨
	for (int i = 0; i < n; i++) {
		inputS(&s[i], i);
	}
	for (int i = 0; i < n; i++) {
		show(s[i]);
	}

	return 0;
}