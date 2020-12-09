// 예제 B-1 LongAdder로 값의 합계 계산

LongAdder adder = new LongAdder();
adder.add(10);
// ...
long sum = adder.sum();
