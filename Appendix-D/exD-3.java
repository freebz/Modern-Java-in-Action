// 코드 생성 전략

public class Lambda {
    Function<Object, String> f = [dynamic invocation of lambda$1]

    static String lambda$1(Object obj) {
	return obj.toString();
    }
}


public class Lambda {
    String header = "This is a ";
    Function<Object, String> f = obj -> header + obj.toString();
}


public class Lambda {
    String header = "This is a ";
    Function<Object, String> f = [dynamic invocation of lambda$1]

    static String lambda$1(String header, Object obj) {
	return obj -> header + obj.toString();
    }
}
