#include<stdio.h>
#include<stdlib.h>
#include<string.h>

// 1. 사용자가 정수 1개 입력
// 2. 단어 입력 -> 기본점수 100점부여
// 3. 점수가 -10 처리됨
// 4. 단어를 맞춤 or 0점 종료
// 5. 단어 맞추기 사용자가 정수 입력한 만큼 반복
// 6. 최종 점수 출력 -> ★

typedef struct WORD {
	char word[10]; // apple  kiwi
	char blind[10]; // _____  ____
	int score;
}W;
int main() {

	printf("단어개수입력: ");
	int n;
	scanf("%d", &n);
	W *w = (W *)malloc(n * sizeof(W));
	for (int i = 0; i < n; i++) {
		printf("단어입력: ");
		scanf("%s", w[i].word); // apple _____
		int j;
		for (j = 0; j < strlen(w[i].word); j++) {
			w[i].blind[j] = '_';
		}
		w[i].blind[j] = '\0'; // 문자배열 => 문자열
							  // a p p l e -> 문자배열
							  // a p p l e \0 -> 문자열
		w[i].score = 100;
	}
	char c;
	int score = 0;
	printf("\n☆★☆★게임을 시작합니다!☆★☆★\n");
	// ctrl+K+F : 줄정리
	for (int j = 0; j < n; j++) {
		while (1) { // => 중단시점 구현하기! (조건확인필수)
			printf("%s : ", w[j].blind);
			scanf(" %c", &c); // 버퍼비우기
							  // 행동을 했는지,안했는지 => sw변수
			int sw = 1;
			for (int i = 0; i < strlen(w[j].word); i++) {
				if (c == w[j].word[i]) {
					w[j].blind[i] = c;
					sw = 0;
				}
			}
			if (sw) {
				// 단어를 맞추지못했다.
				w[j].score -= 10;
				printf("해당 문자는 없습니다!ㅠ\n");
			}
			if (w[j].score == 0 || strcmp(w[j].word, w[j].blind) == 0) {
				printf("\n정답은 [%s]입니다.\n", w[j].word);
				score += w[j].score;
				printf("현재점수는 %d점입니다.\n", score);
				break;
			}
		}
	}
	printf("\n최종점수는 %d점입니다.\n", score);
	if (n * 50 <= score) {
		printf("★☆★☆★☆\n");
	}

	return 0;
}