// 예제 10-14 불리언 플래그 집합을 이용해 주문에 세금 적용

public static double calculate(Order order, boolean useRegional,
			       boolean useGeneral, boolean useSurcharge) {
    double value = order.getValue();
    if (useRegional) value = Tax.regional(value);
    if (useGeneral) value = Tax.general(value);
    if (useSurcharge) value = Tax.surcharge(value);
    return value;
}
