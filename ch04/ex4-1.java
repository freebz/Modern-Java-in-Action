// 예제 4-1 컬렉션: for-each 루프를 이용하는 외부 반복

List<String> names = new ArrayList<>();
for(Dish dish: menu) {
    names.add(dish.getName());
}
