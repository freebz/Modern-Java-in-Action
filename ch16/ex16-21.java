// 예제 16-21 0.5초에서 2.5초 사이의 임의의 지연을 흉내 내는 메서드

private static final Random random = new Random();
public static void randomDelay() {
    int delay = 500 + random.nextInt(2000);
    try {
	Thread.sleep(delay);
    } catch (InterruptedException e) {
	throw new RuntimeException(e);
    }
}
