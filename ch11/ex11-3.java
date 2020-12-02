// 예제 11-3 null 안전 시도 2: 너무 많은 출구

public String getCarInsuranceName(Person person) {
    if (person == null) {
	return "Unknown";
    }
    Car car = person.getCar();
    if (car == null) {
	return "Unknown";
    }
    Insurance insurance = car.getInsurance();
    if (insurance == null) {
	return "Unknown";
    }
    return insurance.getName();
}
