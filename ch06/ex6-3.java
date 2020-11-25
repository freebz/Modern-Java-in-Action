// 예제 6-3 각 서브그룹에서 가장 칼로리가 높은 요리 찾기

Map<Dish, Type, Dish> mostCaloricByType =
    menu.stream()
        .collect(groupingBy(Dish::getType,
		 collectingAndThen(
		     maxBy(comparingInt(Dish::getCalories)),
		 Optional::get)));
