// 예제 16-8 모든 상점에 순차적으로 정보를 요청하는 findPrices

public List<String> findPrices(String product) {
    return shops.stream()
	.map(shop -> String.format("%s price is %.2f",
				   shop.getName(), shop.getPrice(product)))
	.collect(toList());
}
