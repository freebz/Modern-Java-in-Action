// 15.1 동시성을 구현하는 자바 지원의 진화

// 15.1.1 스레드와 높은 수준의 추상화

long sum = 0;
for (int i = 0; i < 1_000_000; i++) {
    sum += stats[i];
}


long sum0 = 0;
for (int i = 0; i < 250_000; i++) {
    sum0 += stats[i];
}


long sum3 = 0;
for (int i = 750_000; i < 1_000_000; i++) {
    sum3 += stats[i];
}


sum = sum0 + ... + sum3;


sum = Arrays.stream(stats).parallel().sum();
