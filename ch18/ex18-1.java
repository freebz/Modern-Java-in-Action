// 예제 18-1 반복 방식의 팩토리얼

static int factorialIterative(int n) {
    int r = 1;
    for (int i = 1; i <= n; i++) {
	r *= i;
    }
    return r;
}
