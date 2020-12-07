// 예제 17-4 Flow.Processor 인터페이스

public interface Processor<T, R> extends Subscriber<T>, Publisher<R> { }
