// 예제 16-2 1초 지연을 흉내 내는 메서드

public static void delay() {
    try {
	Thread.sleep(1000L);
    } catch (InterruptedException e) {
	throw new RuntimeException(e);
    }
}
