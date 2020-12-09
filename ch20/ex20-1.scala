// 20.1 스칼라 소개

// 20.1.1 Hello beer

// 명령형 스칼라

object Beer {
  def main(args: Array[String]) {
    var n : Int = 2
    while( n <= 6 ) {
      println(s"Hello ${n} bottles of beer")
      n += 1
    }
  }
}


// 함수형 스칼라

public class Foo {
  public static void main(String[] args) {
    IntStream.rangeClosed(2, 6)
             .forEach(n -> System.out.println("Hello " + n + "bottles of beer"));
  }
}


object Beer {
  def main(args: Array[String]) {
    2 to 6 foreach { n => println(s"Hello ${n} bottles of beer") }
  }
}
