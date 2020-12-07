// 예제 16-17 독립적인 두 개의 CompletableFuture 합치기

Future<Double> futurePriceInUSD =
        CompletableFuture.supplyAsync(() -> shop.getPrice(product))
        .thenCombine(
	    CompletableFuture.supplyAsync(
		() -> exchangeService.getRate(Money.EUR, Money.USD)),
	    (price, rate) -> price * rate;
        ));
