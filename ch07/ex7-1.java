// 예제 7-1 n개의 숫자를 더하는 함수의 성능 측정

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TImeUnit.MILLISECONDS)
@Fork(2, jvmArgs={"-Xms4G", "-Xmx4G"})
public class ParallelStreamBenchmark {
    private static final long N= 10_000_000L;

    @Benchmark
    public long sequntialSum() {
	return Stream.iterate(1L, i -> i + 1).limit(N)
	             .reduce( 0L, Long::sum);
    }

    @TearDown(Level.Invocation)
    public void tearDown() {
	System.gc();
    }
}
