// 15.4 CompletableFuture와 콤비네이터를 이용한 동시성

public class CFComplete {

    public static void main(String[] args)
	throws ExecutionException, InterruptedException {
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	int x = 1337;

	CompletableFuture<Integer> a = new CompletableFuture<>();
	executorService.submit(() -> a.complete(f(x)));
	int b = g(x);
	System.out.println(a.get() + b);

	executorService.shutdown();
    }
}


public class CFComplete {

    public static void main(String[] args)
	throws ExecutionException, InterruptedException {
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	int x = 1337;

	CompletableFuture<Integer> b = new CompletableFuture<>();
	executorService.submit(() -> b.complete(g(x)));
	int a = f(x);
	System.out.println(a + b.get());

	executorService.shutdown();
    }
}


CompletableFuture<V> thenCombine(CompletableFuture<U> other,
				 BiFunction<T, U, V> fn);


public class CFCombine {
    public static void main(String[] args) throws ExecutionException,
						  InterruptedException {

	ExecutorService executorService = Executors.newFixedThreadPool(10);
	int x = 1337;

	CompletableFuture<Integer> a = new CompletableFuture<>();
	CompletableFuture<Integer> b = new CompletableFuture<>();
	CompletableFuture<Integer> c = a.thenCombine(b, (y, z)-> y + z);
	executorService.submit(() -> a.complete(f(x)));
	executorService.submit(() -> b.complete(g(x)));

	System.out.println(c.get());
	executorService.shutdown();
    }
}
