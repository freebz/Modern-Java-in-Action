// 15.2.4 현실성 확인

// 15.2.5 비동기 API에서 예외는 어떻게 처리하는가?

void f(int x, Consumer<Integer> dealWithResult,
              Consumer<Throwable> dealWithException);


dealWithException(e);


public interface Subscriber<T> {
    void onComplete();
    void onError(Throwable throwable);
    void onNext(T item);
}


void f(int x, Subscriber<Integer> s);


s.onError(t);
