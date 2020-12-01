// 예제 10-5 메서드 체인으로 주식 거래 주문 만들기

Order order = forCustomer( "BigBank" )
        .buy( 80 )
        .stock( "IBM" )
        .on( "NYSE" )
        .at( 125.00 )
        .sell( 50 )
        .stock( "GOOGLE" )
        .on( "NASDAQ" )
        .at( 375.00 )
        .end();
