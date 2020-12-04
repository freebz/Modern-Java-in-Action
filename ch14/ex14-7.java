// 14.9 더 큰 예제 그리고 더 배울 수 있는 방법

module com.example.foo {
    requires com.example.foo.http;
    requires java.logging;
    requires transitive com.exmaple.foo.network;

    exports com.example.foo.bar;
    example com.example.foo.internal to com.example.foo.probe;

    opens com.example.foo.quux;
    opens com.example.foo.internal to com.example.foo.network,
	                              com.example.foo.probe;

    uses com.example.foo.spi.Intf;
    provides com.example.foo.spi.Intf with com.example.foo.Impl;
}
