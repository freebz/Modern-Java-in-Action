// 예제 18-3 스트림 팩토리얼

static long factorialStreams(long n) {
    return LongStream.rangeClosed(1, n)
	             .reduce(1, (long a, long b) -> a * b);
}
