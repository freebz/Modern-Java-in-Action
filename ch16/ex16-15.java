// 예제 16-15 Discount 서비스를 이용하는 가장 간단한 findPrices 구현

public List<String> findPrices(String product) {
    return shops.stream()
	    .map(shop -> shop.getPrice(product))
	    .map(Quote::parse)
    	    .amp(Discount::applyDiscount)
	    .collect(toList());
}
