package Ai_Bot;

public class TrendFollowerBot extends TradingBot {
    private double lastPrice;

    public TrendFollowerBot(String botName) {
        super(botName);
        this.lastPrice = 0;
    }

    @Override
    public void makeDecision(StockMarket market) {
        double currentPrice = market.getStockPrice();

        if (lastPrice == 0) {
            System.out.println(botName + " is waiting for trends...");
        } else if (currentPrice > lastPrice) {
            System.out.println(botName + " decides to BUY stocks as price is rising.");
            buyStocks(1, market);
        } else if (currentPrice < lastPrice) {
            System.out.println(botName + " decides to SELL stocks as price is falling.");
            sellStocks(1, market);
        } else {
            System.out.println(botName + " decides to HOLD (no price change).");
        }

        lastPrice = currentPrice;
    }
}