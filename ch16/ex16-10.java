// 예제 16-10 findPrices 메서드 병렬화

public List<String> findPrices(String product) {
    return shops.parallelStream()
	.map(shop -> String.format("%s price is %.2f",
				   shop.getName(), shop.getPrice(product)))
	.collect(toList());
}
