// 13.3 디폴트 메서드 활용 패턴

// 13.3.1 선택형 메서드

interface Iterator<T> {
    boolean hasNext();
    T next();
    default void remove() {
	throw new UnsupportedOperationException();
    }
}
