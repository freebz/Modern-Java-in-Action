// 예제 3-1 자바 8의 유효한 람다 표현식

(String s) -> s.length()
(Apple a) -> a.getWeight() > 150
(int x, int y) -> {
    System.out.println("Result:");
    System.out.println(x + y);
}
() -> 42
(Apple a1, Apple 2) -> a1.getWeight().compareTo(a2.getWeight())
