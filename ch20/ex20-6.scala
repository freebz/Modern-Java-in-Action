// 20.3 클래스와 트레이트

// 20.3.1 간결성을 제공하는 스칼라의 클래스

class Hello {
    def sayThankYou() {
        println("Thanks for reading our book")
    }
}
val h = new Hello()
h.sayThankYou()


// 게터와 세터

public class Student {
    private String name;
    private int id;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


class Student(var name: String, var id: Int)
val s = new Student("Raoul", 1)
println(s.name)
s.id = 1337
println(s.id)
