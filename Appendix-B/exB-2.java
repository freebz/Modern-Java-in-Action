// 예제 B-2 LongAccumulator로 값의 합께 계산

LongAccumulator acc = new LongAccumulator(Long::sum, 0);
acc.accumulate(10);
// ...
long result = acc.get();
