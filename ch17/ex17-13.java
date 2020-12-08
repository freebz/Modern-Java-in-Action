// 예제 17-13 수신한 온도를 출력하는 Observer

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class TempObserver implements Observer<TempInfo> {
    @Override
    public void onComplete() {
	System.out.println( "Done!" );
    }

    @Override
    public void onError( Throwable throwable ) {
	System.out.println( "Got problem: " + throwable.getMessage() );
    }

    @Override
    public void onSubscribe( Disposable disposable ) {
    }

    @Override
    public void onNext( TempInfo tempInfo ) {
	System.out.println( tempInfo );
    }
}