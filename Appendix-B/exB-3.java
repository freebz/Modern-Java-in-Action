// 예제 B-3 배열의 요소를 병렬로 누적하는 parallelPrefix

int[] ones = new int[10];
Arrays.fill(ones, 1);
Arrays.parallelPrefix(ones, (a, b) -> a + b);
