// 20.2.3 커링

static int multiply(int x, int y) {
    return x * y;
}
int r = multiply(2, 10);


static Function<Integer, Integer> multiplyCurry(int x) {
    return (Integer y) -> x * y;
}


Stream.of(1, 3, 5, 7)
      .map(multiplyCurry(2))
      .forEach(System.out::println);


def multiply(x: Int, y: Int) = x * y

var r = multiply(2, 10);


def multiplyCurry(x :Int)(y :Int) = x * y

var r = multiplyCurry(2)(10)


val multiplyByTwo : Int => Int = multiplyCurry(2)
val r = multiplyByTwo(10)     // 20
