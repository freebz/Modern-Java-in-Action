// 예제 17-10 화씨를 섭씨로 변환하는 Processor

import java.util.concurrent.Flow.*;

public class TempProcessor implements Processor<TempInfo, TempInfo> {

    private Subscriber<? super TempInfo> subscriber;

    @Override
    public void subscribe( Subscriber<? super TempInfo> subscriber ) {
	this.subscriber = subscriber;
    }

    @Override
    public void onNext( TempInfo temp ) {
	subscriber.onNext( new TempInfo( temp.getTown(),
                (temp.getTemp() - 32) * 5 / 9) );
    }

    @Override
    public void onError( Throwable throwable ) {
	subscriber.onError( throwable );
    }

    @Override
    public void onComplete() {
	subscriber.onComplete();
    }
}
