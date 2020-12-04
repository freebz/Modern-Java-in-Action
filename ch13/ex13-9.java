// 13.4.3 충돌 그리고 명시적인 문제 해결

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

public class C implements B, A { }


// 충돌 해결

public class C implements B, A {
    void hello() {
	B.super.hello();
    }
}


// 거의 비슷한 시그니처

public interface A {
    default Number getNumber() {
	return 10;
    }
}

public interface B {
    default Integer getNumber() {
	return 42;
    }
}


public class C implements B, A {
    public static void main(String... args) {
	System.out.println(new C().getNumber());
    }
}
