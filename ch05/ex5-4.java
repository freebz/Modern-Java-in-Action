// 예제 5-4 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오.

String traderStr =
    transactions.stream()
		.map(transaction -> transaction.getTrader().getName())
		.distinct()
		.sorted()
		.reduce("", (n1, n2) -> n1 + n2);
