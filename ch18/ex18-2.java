// 예제 18-2 재귀 방식의 팩토리얼

static long factorialRecursive(long n) {
    return n == 1 ? 1 : n * factorialRecursive(n-1);
}
