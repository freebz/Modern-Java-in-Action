// 예제 16-7 팩토리 메서드 supplyAsync로 Completablefuture 만들기

public Future<Double> getPriceAsync(String product) {
    return Completablefuture.supplyAsync(() -> calculatePrice(product));
}
