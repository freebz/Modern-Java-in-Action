// 예제 16-4 getPriceAsync 메서드 구현

public Future<Double> getPriceAsync(String product) {
    CompletableFuture<Double> futurePrice = new CompletableFuture<>();
    new Thread( () -> {
	        double price = calculatePrice(product);
		futurePrice.complete(price);
    }).start();
    return futurePrice;
}
