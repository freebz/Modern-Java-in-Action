// 예제 10-15 적용할 세금을 유창하게 정의하는 세금 계산기

public class TaxCalculator {
    private boolean useRegional;
    private boolean useGeneral;
    private boolean useSurcharge;

    public TaxCalculator withTaxRegional() {
	useRegional = true;
	return this;
    }

    public TaxCalculator withTaxGeneral() {
	useGeneral = true;
	return this;
    }

    public TaxCalculator withTaxSurcharge() {
	useSurcharge = true;
	return this;
    }

    public double calculate(Order order) {
	return calculate(order, useRegional, useGeneral, use Surcharge);
    }
}
