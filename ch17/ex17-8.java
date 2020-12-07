// 예제 17-8 Publisher를 만들고 TempSubscriber를 구독시킴

import java.util.concurrent.Flow.*;

public class Main {
    public static void main( String[] args ) {
	getTemperatures( "New York" ).subscribe( new TempSubscriber() );
    }

    private static Publisher<TempInfo> getTemperatures( String town ) {
	return subscriber -> subscriber.onSubscribe(
	        new TempSubscription( subscriber, town ) );
    }
}
