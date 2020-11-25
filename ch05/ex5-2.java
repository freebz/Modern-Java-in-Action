// 예제 5-2 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.

List<String> cities =
    transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
