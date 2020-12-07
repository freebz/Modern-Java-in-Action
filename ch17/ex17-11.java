// 예제 17-11 Main 클래스 : Publisher를 만들고 TempSubscriber를 구독시킴

import java.util.concurrent.Flow.*;

public class Main {
    public static void main( String[] args ) {
	getCelsiusTemperatures( "New York" )
	        .subscribe( new TempSubscriber() );
    }

    public static Publisher<TempInfo> getCelsiusTemperatures(String town) {
	return subscriber -> {
	    TempProcessor processor = new TempProcessor();
	    processor.subscribe( subscriber );
	    processor.onSubscribe( new TempSubscription(processor, town) );
	};
    }
}
