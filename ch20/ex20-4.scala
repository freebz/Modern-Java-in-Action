// 20.2.2 익명 함수와 클로저

val isLongTweet : String => Boolean =
    (tweet : String) => tweet.length() > 60


val isLongTweet : String => Boolean =
    new Function1[String, Boolean] {
        def apply(tweet: String): Boolean = tweet.length() > 60
}


isLongTweet.apply("A very short tweet")    // false를 반환함


Function<String, Boolean> isLongTweet = (String s) -> s.length() > 60;
boolean long = isLongTweet.apply("A very short tweet");


isLongTweet("A very short tweet")    // false를 반환함


// 클로저

def main(args: Array[String]) {
    var count = 0
    val inc = () => count+=1
    inc()
    println(count)    // 1출력
    inc()
    println(count)    // 2출력
}


public static void main(String[] args) {
    int count = 0;
    Runnable inc = () -> count+=1;    // 에러: count는 명시적으로 final 또는 final에 준하는 변수여야 함
    inc.run();
    System.out.println(count);
    inc.run();
}
