// 예제 4-3 스크림: 내부 반복

List<String> names = menu.stream()
                    .map(Dish::getName)
                    .collect(toList());
