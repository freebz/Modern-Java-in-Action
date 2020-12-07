// 15.5.2 역압력

void onSubscribe(Subscription subscription);


interface Subscription {
    void cancel ();
    void request (long n);
}
