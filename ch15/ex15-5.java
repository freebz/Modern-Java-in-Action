// 15.2.3 잠자기(그리고 기타 블로킹 동작)는 해로운 것으로 간주

work1();
Thread.sleep(10000);
work2();


public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
	ScheduledExecutorService scheduledExecutorService
	    = Executors.newScheduledThreadPool(1);

	work1();
	scheduledExecutorService.schedule(
	    ScheduledExecutorServiceExample::work2, 10, TimeUnit.SECONDS);

	scheduledExecutorService.shutdown();
    }

    public static void work1() {
	System.out.println("Hello from Work1!");
    }

    public static void work2() {
	System.out.println("Hello from Work2!");
    }
}
