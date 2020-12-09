// 예제 C-2 ForkingStreamConsumer를 만드는 데 사용하는 build 메서드

private ForkingStreamConsumer<T> build() {
    List<BlockingQueue<T>> queues = new ArrayList<>();

    Map<Object, Future<?>> actions =
	forks.entrySet().stream().reduce(
	    new HashMap<Object, Future<?>>(),
	    (map, e) -> {
		map.put(e.getKey(),
			getOperationResult(queues, e.getValue()));
		return map;
	    },
	    (m1, m2) -> {
		m1.putAll(m2);
		return m1;
	    });
    return new ForkingStreamConsumer<>(queues, actions);
}
