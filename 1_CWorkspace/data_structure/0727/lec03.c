/*
	()() o
	))(( x
	(()) o
	(()()) o
	(()()() x
*/
#include<stdio.h>
#include<string.h>

int main() {

	char str[10];
	scanf("%s", str);

	int index = strlen(str) - 1;
	int sum = 0;

	while (index != -1) {
		if (str[index] == ')') {
			sum++;
		}
		else {
			sum--;
		}
		if (sum < 0) {
			break;
		}
		index--;
	}
	if (sum) {
		printf("X");
	}
	else {
		printf("O");
	}

	return 0;
}