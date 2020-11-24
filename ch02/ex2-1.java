// 예제 2-1 동작 파라미터화 : 프레디게이트로 사과 필터링

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
	return apple.getWeight() > 150;
    }
}

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
	return GREEN.equals(apple.getColor());
    }
}

public class FilteringApples {
    public static void main(String ...args) {
	List<Apple> inventory = Arrays.asList(new Apple(80, GREEN),
					      new Apple(155, GREEN),
					      new Apple(120, RED));
	List<Apple> heavyApples =
	    filterApples(inventory, new AppleHeavyWeightPredicate());
	List<Apple> greenApples =
	    filterApples(inventory, new AppleGreenColorPredicate());
    }

    public static List<Apple> filterApples(List<Apple> inventory,
					   ApplePredicate p) {
	List<Apple> result = new ArrayList<>();
	for (Apple apple : inventory) {
	    if (p.test(apple)) {
		result.add(apple);
	    }
	}
	return result;
    }
}
