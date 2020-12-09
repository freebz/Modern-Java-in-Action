// 예제 C-5 BlockingQueue를 탐색하면서 요소를 읽는 Spliterator

class BlockingQueueSpliterator<T> implements Spliterator<T> {
    private final BlockingQueue<T> q;

    BlockingQueueSpliterator(BlockingQueue<T> q) {
	this.q = q;
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action) {
	T t;
	while (true) {
	    try {
		t = q.take();
		break;
	    } catch (InterruptedException e) {
	    }
	}

	if (t != ForkingStreamConsumer.END_OF_STREAM) {
	    action.accept(t);
	    return true;
	}

	return false;
    }

    @Override
    public Spliterator<T> trySplit() {
	return null;
    }

    @Override
    public long estimateSize() {
	return 0;
    }

    @Override
    public int characteristics() {
	return 0;
    }
}
