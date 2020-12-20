#include<stdio.h>
#include<stdlib.h>

/*
	문제

	입력: 1 1 0
	출력: 2 1(2개의 1)

	입력: 1 2 1 1 0
	출력: 1 1 1 2 2 1(1의 1, 1의 2, 2개의 1)

	입력 : 1 1 1 1 0
	출력: 4 1(4개의 1)

	제약사항 : 10개까지만 입력 가능
*/

/*
	힌트1
	동적할당 vs 정적할당
	=> 정적할당을 코드를 짤 수 있으나
	입력이 배열이 아니다란 판단을 내릴 수 있음

	힌트2
	이전 입력과 이후 입력(현재 입력)이 같은지 / 다른지?
	=> 분기점이 달라지기 때문

	1- 정적할당입력 -> 배열x출력
	2- 배열입력이 아니구나~ -> for(;;i+=2)
*/

int main() {

	// 1. 10개의 배열을 만듦
	int number[10] = { 0, };

	// 2. 만든 배열에 사용자에게 값을 받음
	// 만약 0을 받으면 for 문을 벗어난다
	for (int i = 0; i < 10; i++) {
		scanf("%d", &number[i]);
		if (number[i] == 0) { break; }
	}

	// 3. 조건의 맞춰서 출력하기
	int cnt = 0;
	int what = 0;

	for (int i = 0; i < 10; i++) {
		if (number[i] == 0) { break; }

		if (cnt < 1) {
			cnt = 1;
			what = number[i];
		} // end if(cnt < 1)

		if (number[i] == number[i + 1]) {
			what = number[i];
			cnt += 1;
			//printf("뭐가 출력되니 %d %d\n", cnt, what);
		}
		else {
			printf("%d %d ", cnt, what);
			cnt = 0;
			what = 0;
		} // end if()
	} // end for(number[i] == number[i + 1])

	printf("\n");

	return 0;
}