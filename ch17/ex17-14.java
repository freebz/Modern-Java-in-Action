// 예제 17-14 뉴욕의 온도를 출력하는 Main 클래스

public class Main {

    public static void main(String[] args) {
	Observable<TempInfo> observable = getTemperature( "New York" );
	observable.blockingSubscribe( new TempObserver() );
    }
}
