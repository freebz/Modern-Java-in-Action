// 예제 10-13 주문의 총 합에 적용할 세금

public class Tax {
    public static double regional(double value) {
	return value * 1.1;
    }

    public static double general(double value) {
	return value * 1.3;
    }

    public static double surcharge(double value) {
	return value * 1.05;
    }
}
