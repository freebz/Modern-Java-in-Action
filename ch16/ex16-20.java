// 예제 16-20 CompletableFuture에 타임아웃이 발생하면 기본값으로 처리

Future<Double> futurePriceInUSD =
    CompletableFuture.supplyAsync(() -> shop.getPrice(product))
    .thenCombine(
	CompletableFuture.supplyAsync(
	    () -> exchangeService.getRate(Money.EUR, Money.USD))
	    .completeOnTimeout(DEFAULT_RATE, 1, TimeUnit.SECONDS),
	(price, rate) -> price * rate
    ))
    .orTimeout(3, TimeUnit.SECONDS);
