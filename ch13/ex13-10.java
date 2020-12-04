// 13.4.4 다이아몬드 문제

public interface A {
    default void hello() {
	System.out.println("Hello from A");
    }
}
public interface B extends A { }
public interface C extends A { }
public class D implements B, C {
    public static void main(String... args) {
	new D().hello();
    }
}


public interface C extends A {
    void hello();
}
