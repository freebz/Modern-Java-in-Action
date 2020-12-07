// 예제 16-19 CompletableFuture에 타임아웃 추가

Future<Double> futurePriceInUSD =
    CompletableFuture.supplyAsync(() -> shop.getPrice(product))
    .thenCombine(
	CompletableFuture.supplyAsync(
	    () -> exchangeService.getRate(Money.EUR, Money.USD)),
	(price, rate) -> price * rate
    ))
    .orTimeout(3, TimeUnit.SECONDS);
