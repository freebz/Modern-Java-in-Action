// 예제 16-14 Discount 서비스

public class Discount {
    public enum Code {
	// 소스 생략
    }

    public static String applyDiscount(Quote quote) {
	return quote.getShopName() + " price is " +
	    Discount.apply(quote.getPrice(),
			   quote.getDiscountCode());
    }

    private static double apply(double price, Code code) {
	delay();
	return format(price * (100 - code.percentage) / 100);
    }
}
