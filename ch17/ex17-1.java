// 예제 17-1 Flow.Publisher 인터페이스

@FunctionalInterface
public interface Publisher<T> {
    void subscribe(Subscriber<? super T> s);
}
