// 예제 10-9 함수 시퀀싱으로 주식 거래 주문 만들기

Order order = order( o -> {
    o.forCustomer( "BigBank" );
    o.buy( t -> {
	t.quantity( 80 );
	t.price( 125.00 );
	t.stock( s -> {
	    s.symbol( "IBM" );
	    s.market( "NYSE" );
	});
    });
    o.sell( t -> {
	t.quantity( 50 );
	t.price( 375.00 );
	t.stock( s -> {
	    s.symbol( "GOOGLE" );
	    s.market( "NASDAQ" );
	});
    });
});
