// 예제 6-6 n 이하의 자연수를 소수와 비소수로 분류하기

public Map<Boolean, List<Integer>> partitionPrimes(int n) {
    return IntStream.rangeClosed(2, n).boxed()
	            .collect(partitioningBy(candidate -> isPrime(candidate)));
}
