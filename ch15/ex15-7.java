// 15.3 박스와 채널 모델

int t = p(x);
System.out.println( r(q1(t), q2(t)) );


int t = p(x);
Future<Integer> a1 = executorService.submit(() -> q1(t));
Future<Integer> a2 = executorService.submit(() -> q2(t));
System.out.println( r(a1.get(), a2.get()) ):
