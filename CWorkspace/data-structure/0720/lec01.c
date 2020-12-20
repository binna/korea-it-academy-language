#include<stdio.h>
#include<stdlib.h>

typedef struct student {
	char name[10];
	int score;
	int num;
}S;

void f1(S *s, int index, int num) {
	printf("이름입력: ");
	scanf("%s", s[index].name);
	printf("성적입력: ");
	scanf("%d", &s[index].score);
	s[index].num = num;
}

void f3(S *s, int index) {
	for (int i = 0; i < index; i++) {
		printf("%d. %s : %d\n", s[i].num, s[i].name, s[i].score);
	}
}

void f4(S *s, int index, int x) {
	for (int i = 0; i < index; i++) {
		if (s[i].num == x) {
			// 성적수정진행
			printf("%s학생의 성적재입력: ", s[i].name);
			scanf("%d", &s[i].score);
			return;
		}
	}
	printf("일치하는 번호가 없습니다!\n");
}

int main() {

	int n;
	scanf("%d", &n); // 학생수
	S *stu = (S *)malloc(n * sizeof(S));
	int index = 0; // 수위,인덱스번호
	int act;
	int num = 1001;
	while (1) {
		printf("1.입력 2.삭제 3.출력 4.수정 5.종료\n");
		printf("수행할번호입력: ");
		scanf("%d", &act);
		if (act == 1) {
			// 최초생성한 학생수보다 더많이 입력할수없음!
			if (index == n) {
				printf("더이상입력불가!\n");
				continue;
			}
			f1(stu, index, num);
			index++;
			num++;
		}
		else if (act == 2) {
			// 가장마지막에 추가한학생 삭제
			// -1명은 불가능!
			if (index == 0) {
				printf("더이상삭제불가!\n");
				continue;
			}
			index--;
		}
		else if (act == 3) {
			f3(stu, index);
		}
		else if (act == 4) {
			printf("수정할학생번호입력: ");
			int x;
			scanf("%d", &x);
			f4(stu, index, x);
			// 수정할학생의 번호입력->성적수정가능
		}
		else {
			printf("프로그램종료\n");
			break;
		}
	}


	return 0;
}