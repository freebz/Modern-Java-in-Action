// 예제 D-1 익명 내부 클래스로 구현한 Function;

import java.util.function.Function;

public class InnerClass {
    Function<Object, String> f = new Function<Object, String>() {
	@Override
	public String apply(Object obj) {
	    return obj.toString();
	}
    };
}


/* byte code
 0: aload_0
 1: invokedspecial   #1      // Method java/lang/Object."<init>":()V
 4: aload_0
 5: new              #2      // class InnerClass$1
 8: dup
 9: aload_0
10: invokespecial    #3      // Method InnerClass$1."<init>":(LInnerClass;)V
13: putfield         #4      // Field f:Ljava/util/function/Function;
16: return
 */
