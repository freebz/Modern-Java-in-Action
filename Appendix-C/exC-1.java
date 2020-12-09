// 예제 C-1 스트림에 여러 연산을 수행하는 데 필요한 StreamForker 정의

public class StreamForker<T> {
    private final Stream<T> stream;
    private final Map<Object, Function<Stream<T>, ?>> forks = new HashMap<>();

    public StreamForker(Stream<T> stream) {
	this.stream = stream;
    }

    public StreamForker<T> fork(Object key, Function<Stream<T>, ?> f) {
	forks.put(key, f);
	return this;
    }

    public Results getResults() {
	// 구현해야 함
    }
}


public static interface Results {
    public <R> R get(Object key);
}


public Results getResults() {
    ForkingStreamConsumer<T> consumer = build();
    try {
	stream.sequential().forEach(consumer);
    } finally {
	consumer.finish();
    }
    return consumer;
}
