// 예제 5-3 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.

List<Trader> traders =
    transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
