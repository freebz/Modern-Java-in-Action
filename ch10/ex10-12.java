// 예제 10-12 여러 형식을 혼합한 DSL을 제공하는 주문 빌더

public class MixedBuilder {

    public static Order forCustomer(String customer,
				    TradeBuilder... builders) {
	Order order = new Order();
	order.setCustomer(customer);
	Stream.of(builders).forEach(b -> order.addTrade(b.trade));
	return order;
    }

    public static TradeBuilder buy(Consumer<TradeBuilder> consumer) {
	return buildTrade(consumer, Trade.Type.BUY);
    }

    public static TradeBuilder sell(Consumer<TradeBuilder> consumer) {
	return buildTrade(consumer, Trade.Type.SELL);
    }

    private static TradeBuilder buildTrade(Consumer<TradeBuilder> consumer,
					   Trade.Type type) {
	TradeBuilder builder = new TradeBuilder();
	builder.trade.setType(type);
	consumer.accept(builder);
	return builder;
    }
}


public class TradeBuilder {
    private Trade trade = new Trade();

    public TradeBuilder quantity(int quantity) {
	trade.setQuantity(quantity);
	return this;
    }

    public TradeBuilder at(double price) {
	trade.setPrice(price);
	return this;
    }

    public StockBuilder stock(String symbol) {
	return new StockBuilder(this, trade, symbol);
    }
}


public class StockBuilder {
    private final TradeBuilder builder;
    private final Trade trade;
    private final Stock stock = new Stock();

    private StockBuilder(TradeBuilder builder, Trade trade, String symbol) {
	this.builder = builder;
	this.trade = trade;
	stock.setSymbol(symbol);
    }

    public TradeBuilder on(String market) {
	stock.setMarket(market);
	trade.setStock(stock);
	return builder;
    }
}
