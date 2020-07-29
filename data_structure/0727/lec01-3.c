// 동적 할당을 이용한 스택 구현
#include <stdio.h>
#include <stdlib.h>

void push(int data, int* stack, int index) {
	stack[index] = data;
}

int main() {
	printf("스택의 크기를 입력하세요 : ");
	int num;
	scanf("%d", &num);

	int* stack = (int*)malloc(num * sizeof(int));
	int index = 0;

	int act;
	while (1) {
		printf("1.push() 2. pop 3.peek 4.size 5.종료\n");

		printf("번호 입력 : ");
		scanf("%d", &act);
		if (act == 1) {
			if (index == num) {
				printf("가득차서 입력 불가\n");
				continue;
			}
			printf("데이터 입력 : ");
			int data;
			scanf("%d", &data);
			push(data, stack, index);
			index++;
		}
		else if (act == 2) {
			if (index == 0) {
				printf("텅 비어서 출력 불가\n");
				continue;
			}
			printf("pop 수행 %d\n", stack[--index]);
		}
		else if (act == 3) {
			if (index == 0) {
				printf("텅 비어서 출력 불가\n");
				continue;
			}
			printf("peek 수행 %d\n", stack[index - 1]);
		}
		else if (act == 4) {
			printf("데이터의 개수는 %d개 입니다\n", index);
		}
		else {
			printf("종료\n");
			break;
		}
	}

	return 0;
}