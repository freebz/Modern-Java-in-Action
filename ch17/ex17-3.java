// 예제 17-3 Flow.Subscription 인터페이스

public interface Subscription {
    void request(long n);
    void cancel();
}
