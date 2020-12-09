// 20.3.2 스칼라 트레이트와 자바 인터페이스

trait Sized {
    var size : Int = 0
    def isEmpty() = size == 0
}


class Empty extends Sized

println(new Empty().isEmpty())


class Box
val b1 = new Box() with Sized
println(b1.isEmpty())
val b2 = new Box()
b2.isEmpty()    // 컴파일 에러: Box 클래스 선언이 Sized를 상속하지 않았음
