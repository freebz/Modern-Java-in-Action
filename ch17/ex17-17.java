// 예제 17-17 세 도시의 온도를 출력하는 Main 클래스

public class Main {
    public static void main(String[] args) {
	Obervable<TempInfo> observable = getCelsiusTemperatures(
	       "New York", "Chicago", "San Francisco" );
	observable.blockingSubscribe( new TempObserver() );
    }
}
