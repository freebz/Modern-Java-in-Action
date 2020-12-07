// 예제 16-13 enum으로 할인 코드 정의하기

public class Discount {
    public enum Code {
	NONE(0), SILVER(5), GOLD(10), PLATINUM(15), DIAMOND(20);

	private final int percentage;

	Code(int percentage) {
	    this.percentage = percentage;
	}
    }
    // 생략된 Discount 클래스 구현은 [예제 16-14] 참조
}
