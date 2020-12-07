// 예제 16-12 우리의 최저가격 검색 애플리케이션에 맞는 커스텀 Executor

private final Executor executor =
    Executors.newFixedThreadPool(Math.min(shop.size(), 100),
				 new ThreadFactory() {
            public Thread newThread(Runnable r) {
		Thread t = new Thread();
		t.setDaemon(true);
		return t;
	    }
});
