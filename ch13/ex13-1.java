// CAHPTER 13 디폴트 메서드

default void sort(Comparator<? super E> c) {
    Collections.sort(this, c);
}


List<Integer> numbers = Arrays.asList(3, 5, 1, 2, 6);
numbers.sort(Comparator.naturalOrder());


default Stream<E> stream() {
    return StreamSupport.stream(spliterator(), false);
}
