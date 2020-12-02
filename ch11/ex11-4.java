// 예제 11-4 Optional로 Person/Car/Insurance 데이터 모델 재정의

public class Person {
    private Optional<Car> car;
    public Optional<Car> getCar() {
	return car;
    }
}

public class Car {
    private Optional<Insurance> insurance;
    public Optional<Insurance> getInsurance() {
	return insurance;
    }
}

public class Insurance {
    private String name;
    public String getName() {
	return name;
    }
}
