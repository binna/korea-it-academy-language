// 구조체
// : 타입이 다른 것들을 하나로 묶어서 사용하고 싶을때 사용 가능
// 배열
#include<stdio.h>
#include<string.h>
struct student {
	char name[10];		// 멤버변수(=속성, 필드)
	int score;
	double avg;
}; // 붕어빵틀
typedef struct point { // 구조체 점: ( x , y )
	int x;
	int y;
}P;	// 구조체 점을 P라는 자료형으로 만듦!
		// typedef 장점 : 가독성 증가, 이식성 증가

int main() {
	struct student s1 = { "홍길동", 70, 72.4 };
	struct student s2;
	s2.score = 71;
	s2.avg = 74.5;
	//s2.name = "안녕";	// 비주얼 스튜디오가 문자열을 대단히 불안정하게 생각하기 때문에
	// 이런식으로 쓰는 것을 막아놨다.
	// 그렇다고 못쓰는 건 아니고 strcpy를 통해 사용 가능하다.
	strcpy(s2.name, "임꺽정");
	//scanf("%lf", &s2.avg);

	//struct point p1;
	//struct point p2;
	// p1의 x, y좌표와 p2의 x, y 좌표를 입력
	// -> 중점을 p3에 저장 => 출력
	//struct point p3;

	// struct point -> P라고 불리는 자료형
	P p1;
	P p2;
	P p3;

	printf("p1의 좌표입력(x, y): ");
	scanf("%d%d", &p1.x, &p1.y);
	printf("p2의 좌표입력(x, y): ");
	scanf("%d%d", &p2.x, &p2.y);
	p3.x = (p1.x - p2.x) / 2;
	p3.y = (p1.y - p2.y) / 2;

	printf("중점 좌표는 (%d, %d)입니다.\n", p3.x, p3.y);

	P p[3];	// 구조체 배열
	for (int i = 0; i < 2; i++) {
		printf("p[%d]의 좌표입력(x,y): ", i);
		scanf("%d%d", &p[i].x, &p[i].y);
	}
	p[2].x = (p[0].x - p[1].x) / 2;
	p[2].y = (p[0].y - p[1].y) / 2;
	printf("중점 좌표는 (%d, %d)입니다.\n", p[2].x, p[2].y);

	return 0;
}