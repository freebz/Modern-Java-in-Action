// 예제 6-7 PrimeNumbersCollector

public class PrimeNumberCollector implements Collector<Integer,
        Map<Boolean, List<Integer>>,
        Map<Boolean, List<Integer>>> {
    @Override
    public Supplier<Map<Boolean, List<Integer>>> supplier() {
	return () -> new HashMap<Boolean, List<Integer>>() {{
	    put(true, new ArrayList<Integer>());
	    put(false, new ArrayList<Integer>());
	}};
    }
    @Override
    public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
	return (Map<Boolean, List<Integer>> acc, Integer candidate) -> {
	    acc.get( isPrime( acc.get(true),
		candidate) )
	       .add(candidate);
	};
    }
    @Override
    public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
	return (Map<Boolean, List<Integer>> map1,
	    Map<Boolean, List<Integer>> map2) -> {
	        map1.get(true).addAll(map2.get(true));
		map1.get(false).addAll(map2.get(false));
	    return map1;
	};
    }
    @Override
    public Function<Map<Boolean, List<Integer>>,
	Map<Boolean, List<Integer>>> finisher() {
	    return Function.identity();
    }
    @Override
    public Set<Characteristics> characteristics() {
	return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
    }
}
