def factorial(number):
    fact = 1
    for i in range(1, number + 1):
        fact *= i
    return fact


number = int(input('숫자를 입력하세요 : '))
fact = factorial(number)
print('{} factorial = {}'.format(number, fact))


def factorialRecursion(number):
    if number == 1:
        return 1
    return number * factorialRecursion(number - 1)


# number 의 5가 넘어왔을 때 함수가 실행되는 순서
# 5 * factorialRecursion(4)
# 5 * (4 * factorialRecursion(3))
# 5 * (4 * (3 * factorialRecursion(2)))
# 5 * (4 * (3 * (2 * factorialRecursion(1))))
# 5 * (4 * (3 * (2 * (1))))

# 5 * (4 * (3 * (2 * 1)))
# 5 * (4 * (3 * 2))
# 5 * (4 * 6)
# 5 * 24
# 120
fact = factorialRecursion(number)
print('{} factorialRecursion = {}'.format(number, fact))
