// A.2 일반화된 대상 형식 추론

static <T> List<T> emptyList();

List<Car> cars = Collections.<Car>emptyList();

List<Car> cars = Collections.emptyList();


static void cleanCars(List<Car> cars) {

}
cleanCars(Collections.emptyList());


List<Car> cleanCars = dirtyCars.stream()
                               .filter(Car::isClean)
                               .collect(Collectors.toList());
