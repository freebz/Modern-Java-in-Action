// 예제 5-5 밀라노에 거래자가 있는가?

boolean milanBased =
    transactions.stream()
		.anyMatch(transaction -> transaction.getTrader()
			                            .getCity()
			                            .equals("Milan"));
