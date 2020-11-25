// 예제 5-8 전체 트랜잭션 중 최솟값은 얼마인가?

Optional<Transaction> smallestTransaction =
    transactions.stream()
		.reduce((t1, t2) ->
			 t1.getValue() < t2.getValue() ? t1 : t2);
