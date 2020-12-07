// 15.2 동기 API와 비동기 API

int f(int x);
int g(int x);


int y = f(x);
int z = g(x);
System.out.println(y + z);


class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
	int x = 1337;
	Result result = new Result();

	Thread t1 = new Thread(() -> { result.left = f(x); } );
	Thread t2 = new Thread(() -> { result.right = g(x); });
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(result.left + result + right);
    }

    private static class Result {
	private int left;
	private int right;
    }
}


public class ExecutorServiceExample {
    public static void main(String[] args)
	throws ExecutionException, InterruptedException {

	int x = 1337;

	ExecutorService executorService = Executors.newFixedThreadPool(2);
	Future<Integer> y = executorService.submit(() -> f(x));
	Future<Integer> z = executorService.submit(() -> g(x));
	System.out.println(y.get() + z.get());

	executorService.shutdown();
    }
}
