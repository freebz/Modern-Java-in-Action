// 예제 6-2 다수준 그룹화

Map<Dish, Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel =
menu.stream().collect(
    groupingBy(Dish::getType,
        groupingBy(dish -> {
            if (dish.getCalories() <= 400)
		return CaloricLevel.DIET;
	    else if (dish.getCalories() <= 700)
		return CaloricLevel.NORMAL; else return CaloricLevel.FAT;
        })
    )
);
