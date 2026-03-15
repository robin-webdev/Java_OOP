package Ai_Bot;

public class ShortSellingBot extends TradingBot {
    private boolean hasShorted;

    public ShortSellingBot(String botName) {
        super(botName);
        this.hasShorted = false;
    }

    @Override
    public void makeDecision(StockMarket market) {
        double currentPrice = market.getStockPrice();

        if (!hasShorted && currentPrice > 100) {
            System.out.printf("%s shorted stocks at $%.2f.%n", botName, currentPrice);
            sellStocks(5, market);
            hasShorted = true;
        } else if (hasShorted && currentPrice < 90) {
            System.out.printf("%s bought back stocks at $%.2f for profit.%n", botName, currentPrice);
            buyStocks(5, market);
            hasShorted = false;
        } else {
            System.out.println(botName + " decides to HOLD.");
        }
    }
}