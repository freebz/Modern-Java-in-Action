// 20.1.2 기본 자료구조: 리스트, 집합, 맵, 튜플, 스트림, 옵션

// 컬렉션 만들기

val authorsToAge = Map("Raoul" -> 23, "Mario" -> 40, "Alan" -> 53)


Map<String, Integer> authorsToAge = new HashMap<>();
authorsToAge.put("Raoul", 23);
authorsToAge.put("Mario", 40);
authorsToAge.put("Alan", 53);


Map<String, Integer> authorsToAge
    = Map.ofEntries(entry("Raoul", 23),
                    entry("Mario", 40),
                    entry("Alan", 53));


val authors = List("Raoul", "Mario", "Alan")
val numbers = Set(1, 1, 2, 3, 5, 8)


// 불변과 가변

val numbers = Set(2, 5, 3);
val newNumbers = numbers + 8
println(newNumbers)    // (2, 5, 3, 8)
println(numbers)       // (2, 5, 3)


// 변경불가와 불변

Set<Integer> numbers = new HashSet<>();
Set<Integer> newNumbers = Collections.unmodifiableSet(numbers);


// 컬렉션 사용하기

val fileLines = Source.fromFile("data.txt").getLines.toList()
val linesLongUpper =
    fileLines.filter(l => l.length() > 10)
             .map(l => l.toUpperCase())


val linesLongUpper =
    fileLines filter (_.length() > 10) map(_.toUpperCase())


val linesLongUpper =
    fileLines.par filter (_.length() > 10) map(_.toUpperCase())


// 튜플

public class Pair<X, Y> {
    public final X x;
    public final Y y;
    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}


Pair<String, String> raoul = new Pair<>("Raoul", "+ 44 007007007");
Pair<String, String> alan = new Pair<>("Alan", "+44 003133700");


val raoul = ("Raoul", "+ 44 887007007")
val alan = ("Alan", "+44 883133700")


val book = (2018, "Modern Java in Action", "Manning")
val numbers = (42, 1337, 0, 3, 14)


println(book._1)      // 2018 출력
println(numbers._4)      // 3 출력


// 스트림

// 옵션

public String getCarInsuranceName(Optional<Person> person, int minAge) {
    return person.filter(p -> p.getAge() >= minAge)
                 .flatMap(Person::getCar)
                 .flatMap(Car::getInsurance)
                 .map(Insurance::getName)
                 .orElse("Unknown");
}


def getCarInsuranceName(person: Option[Person], minAge: Int) =
    person.filter(_.getAge() >= minAge)
          .flatMap(_.getCar)
          .flatMap(_.getInsurance)
          .map(_.getName)
          .getOrElse("Unknown")
