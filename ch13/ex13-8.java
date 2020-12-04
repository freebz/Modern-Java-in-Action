// 13.4.1 알아야 할 세 가지 해결 규칙

// 13.4.2 디폴트 메서드를 제공하는 서브인터페이스가 이긴다

public class D implements A { }
public class C extends D implements B, A {
    public static void main(String... args) {
	new C().hello();
    }
}


// 해석 규칙을 기억하라

public class D implements A {
    void hello() {
	System.out.println("Hello from D");
    }
}

public class C extends D implements B, A {
    public static void main(String... args) {
	new C().hello();
    }
}


public abstract class D implements A {
    public abstract void hello();
}
