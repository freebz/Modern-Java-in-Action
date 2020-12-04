// 13.4 해석 규칙

public interface A {
    default void hello() {
	System.out.println("Hello from A");
    }
}

public interface B {
    default void hello() {
	System.out.println("Hello from B");
    }
}

public class C implements B, A {
    public static void main(String... args) {
	new C().hello();
    }
}
