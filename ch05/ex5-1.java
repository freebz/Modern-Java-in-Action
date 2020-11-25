// 예제 5-1 2011년에 일어난 모든 트랜잭션을 찾아서 값을 오름차순으로 정렬하시오.

List<Transaction> tr2011 =
    transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
