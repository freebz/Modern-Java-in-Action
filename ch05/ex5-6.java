// 예제 5-6 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.

transactions.stream()
            .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
            .map(Transaction::getValue)
            .forEach(System.out::println);
