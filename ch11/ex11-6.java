// 예제 11-6 사람 목록을 이용해 가입한 보험 회사 이름 찾기

public Set<String> getCarInsuranceNames(List<Person> persons) {
    return persons.stream()
	          .map(Person::getCar)
	          .map(optCar -> optCar.flatMap(Car::getInsurance))
	          .map(optIns -> optIns.map(Insurance::getName))
	          .flatMap(Optional::stream)
	          .collect(toSet());
