// 15.5 발행-구독 그리고 리액티브 프로그래밍

// 15.5.1 두 플로를 합치는 예제

private class SimpleCell {
    private int value = 0;
    private String name;
    public SimpleCell(String name) {
	this.name = name;
    }
}


SimpleCell c2 = new SimpleCell("C2");
SimpleCell c1 = new SimpleCell("C1");


interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);
}


interface Subscriber<T> {
    void onNext(T t);
}


private class SimpleCell implements Publisher<Integer>, Subscriber<Integer> {
    private int value = 0;
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    public SimpleCell(String name) {
	this.name = name;
    }

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
	subscribers.add(subscriber);
    }

    private void notifyAllSubscribers() {
	subscribers.forEach(subscriber -> subscriber.onNext(this.value));
    }

    @Override
    public void onNext(Integer newValue) {
	this.value = newValue;
	System.out.println(this.name + ":" + this.value);
	notifyAllSubscribers();
    }
}


SimpleCell c3 = new SimpleCell("C3");
SimpleCell c2 = new SimpleCell("C2");
SimpleCell c1 = new SimpleCell("C1");

c1.subscribe(c3);

c1.onNext(10); // C1의 값을 10으로 갱신
c2.onNext(20); // C2의 값을 20으로 갱신


// C1:10
// C3:10
// C2:20


public class ArithmeticCell extends SimpleCell {
    private int left;
    private int right;

    public ArithmeticCell(String name) {
	super(name);
    }

    public void setLeft(int left) {
	this.left = left;
	onNext(left + this.right);
    }

    public void setRight(int right) {
	this.right = right;
	onNext(right + this.left);
    }
}


ArithmeticCell c3 = new ArithmeticCell("C3");
SimpleCell c2 = new SimpleCell("C2");
SimpleCell c1 = new SimpleCell("C1");

c1.subscribe(c3::setLeft);
c2.subscribe(c3::setRight);

c1.onNext(10); // C1의 값을 10으로 갱신
c2.onNext(20); // C2의 값을 20으로 갱신
c1.onNext(15); // C1의 값을 15로 갱신


// C1:10
// C3:10
// C2:20
// C3:30
// C1:15
// C3:35


ArithmeticCell c5 = new ArithmeticCell("C5");
ArithmeticCell c3 = new ArithmeticCell("C3");

SimpleCell c4 = new SimpleCell("C4");
SimpleCell c2 = new SimpleCell("C2");
SimpleCell c1 = new SimpleCell("C1");

c1.subscribe(c3::setLeft);
c2.subscribe(c3::setRight);

c3.subscribe(c5::setLeft);
c4.subscribe(c5::setRight);


c1.onNext(10); // C1의 값을 10으로 갱신
c2.onNext(20); // C2의 값을 20으로 갱신
c1.onNext(15); // C1의 값을 15로 갱신
c4.onNext(1);  // C4의 값을 1으로 갱신
c4.onNext(3);  // C4의 값을 3으로 갱신


// C1:10
// C3:10
// C5:10
// C2:20
// C3:30
// C5:30
// C1:15
// C3:35
// C5:35
// C4:1
// C5:36
// C4:3
// C5:38
