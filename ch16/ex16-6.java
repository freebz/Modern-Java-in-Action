// 예제 16-6 CompletableFuture 내부에서 발생한 에러 전파

public Future<Double> getPriceAsync(String product) {
    CompletableFuture<Double> futurePrice = new CompletableFuture<>();
    new Thread(() -> {
	         try {
		     double price = calculatePrice(product);
		     futurePrice.complete(price);
		 } catch (Exception ex) {
		     futurePrice.completeExceptionally(ex);
		 }
    }).start();
    return futurePrice;
}
