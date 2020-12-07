// 15.2.1 Future 형식 API

Future<Integer> f(int x);
Future<Integer> g(int x);


Future<Integer> y = f(x);
Future<Integer> z = g(x);
System.out.println(y.get() + z.get());
