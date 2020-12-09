// 예제 D-2 람다 표현식으로 구현한 Function

import java.util.function.Function;

public class Lambda {
    Function<Object, String> f = obj.toString();
}


/* byte code
 0: aload_0
 1: invokedspecial   #1      // Method java/lang/Object."<init>":()V
 4: aload_0
 5: invokedynamic    #2    0 // InvokeDynamic
                                #0:apply:()Ljava/util/function/Function;
10: putfield         #3      // Field f:Ljava/util/function/Function;
13: return
 */
