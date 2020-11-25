// 예제 5-7 전체 트랜잭션 중 최댓값은 얼마인가?

Optional<Integer> highestValue =
    transactions.stream()
		.map(Transaction::getValue)
		.reduce(Integer::max);
