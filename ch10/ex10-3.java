// 예제 10-3 유연한 그룹화 컬렉터 빌더

import static java.util.stream.Collectors.groupingBy;
public class GroupingBuilder<T, D, K> {
    private final Collector<? super T, ?, Map<K, D>> collector;

    private GroupingBuilder(Collector<? super T, ?, Map<K, D>> collector) {
	this.collector = collector;
    }

    public Collector<? super T, ?, Map<K, D>> get() {
	return collector;
    }

    public <J> GroupingBuilder<T, Map<K, D>, J>
	    after(Function<? super T, ? extends J> classifier) {
	return new GroupingBuilder<>(groupingBy(classifier, collector));
    }

    public static <T, D, K> GroupingBuilder<T, List<T>, K>
	    groupOn(Function<? super T, ? extends K> classifier) {
	return new GroupingBuilder<>(groupingBy(classifier));
    }
}
