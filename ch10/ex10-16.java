// 예제 10-16 유창하게 세금 함수를 적용하는 세금 계산기

public class TaxCalculator {
    public DoubleUnaryOperator taxFunction = d -> d;

    public TaxCalculator with(DoubleUnaryOperator f) {
	taxFunction = taxFunction.andThen(f);
	return this;
    }

    public double calculate(Order order) {
	return taxFunction.applyAsDouble(order.getValue());
    }
}
