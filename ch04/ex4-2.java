// 예제 4-2 컬렉션: 내부적으로 숨겨졌던 반복자를 사용한 외부 반복

List<String> names = new ArrayList<>();
Iterator<String> iterator = menu.iterator();
while(iterator.hasNext()) {
    Dish dish = iterator.next();
    names.add(dish.getName());
}
