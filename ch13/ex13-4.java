// 13.2 디폴트 메서드란 무엇인가?

public interface Sized {
    int size();
    default boolean isEmpty() {
	return size() == 0;
    }
}


default void setRelativeSize(int wFactor, int hFactor) {
    setAbsoluteSize(getWidth() / wFactor, getHeight() / hFactor);
}

// removeIf

default boolean removeIf(Predicate<? super E> filter) {
    boolean removed = false;
    Iterator<E> each = iterator();
    while(each.hasNext()) {
	if(filter.test(each.next())) {
	    each.remove();
	    removed = true;
	}
    }
    return removed;
}
