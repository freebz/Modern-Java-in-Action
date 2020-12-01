// 예제 10-11 여러 DSL 패턴을 이용해 주식 거래 주문 만들기

Order order =
    forCustomer( "BigBank",
		buy( t -> t.quantity( 80 )
		           .stock( "IBM" )
		           .on( "NYSE" )
		           .at( 125.00 )),
		sell( t -> t.quantity( 50 )
		            .stock( "GOOGLE" )
		            .on( "NASDAQ" )
		            .at( 125.00 )) );
