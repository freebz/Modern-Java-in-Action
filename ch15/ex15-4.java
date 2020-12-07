// 15.2.2 리액티브 형식 API

void f(int x, IntConsumer dealWithResult);


public class CallbackStyleExample {
    public static void main(String[] args) {

	int x = 1337;
	Result result = new Result();

	f(x, (int y) -> {
	    result.left = y;
	    System.out.println((result.left + result.right));
	});

	g(x, (int z) -> {
	    result.right = z;
	    System.out.println((result.left + result.right));
	});
    }
}
