// 예제 10-7 중첩된 함수로 주식 거래 만들기

Order order = order("BigBank",
		    buy(80,
			stock("IBM", on("NYSE")), at(125.00)),
		    sell(50,
			 stock("GOOGLE", on("NASDAQ")), at(375.00))
		   );
