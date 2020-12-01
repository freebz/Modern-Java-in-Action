// 예제 10-18 큐컴버 어노테이션을 이용해 테스트 시나리오 구현

public class BuyStocksSteps {
    private Map<String, Integer> stockUnitPrices = new HashMap<>();
    private Order order = new Order();

    @Given("^the price of a \"(.*?)\" stock is (\\d+)\\$$")
    public void setUnitPrice(String stockName, int unitPrice) {
	stockUnitValues.put(stockName, unitPrice);
    }

    @When("^I buy (\\d+) \"(.*?)\"$")
    public void buyStocks(int quantity, String stockName) {
	Trade trade = new Trade();
	trade.setType(Trade.Type.BUY);

	Stock stock = new Stock();
	stock.setSymbol(stockName);

	trade.setStock(stock);
	trade.setPrice(stockUnitPrices.get(stockName));
	trade.setQuanity(quantity);
	order.addTrade(trade);
    }

    @Then("^the order value should be (\\d+)\\$$")
    public void checkOrderValue(int expectedValue) {
	assertEquals(expectedValue, order.getValue());
    }
}
