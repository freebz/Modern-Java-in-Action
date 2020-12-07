// 예제 17-12 1초마다 한 개의 온도를 방출하는 Observable 만들기

public static Observable<TempInfo> getTemperature(String town) {
    return Observable.create(emitter ->
            Observable.interval(1, TimeUnit.SECONDS)
	            .subscribe(i -> {
		        if (!emitter.isDisposed()) {
			    if ( i >= 5 ) {
				emitter.onComplete();
			    } else {
				try {
				    emitter.onNext(TempInfo.fetch(town));
				} catch (Exception e) {
				    emitter.onError(e);
				}
			    }
			}}));
}
