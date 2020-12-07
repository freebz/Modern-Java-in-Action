// 예제 17-9 TempSubscription에 Executor 추가하기

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TempSubscription implements Subscription {

    private static final ExecutorService executor =
	    Executors.newSingleThreadExecutor();
    @Override
    public void request( long n ) {
	executor.submit( () -> {
	    for (long i = 0L; i < n; i++) {
		try {
		    subscriber.onNext( TempInfo.fetch( town ) );
		} catch (Exception e) {
		    subscriber.onError( e );
		    break;
		}
	    }
	});
    }
}
