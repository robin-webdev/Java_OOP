package Ai_Bot;

public class StockTradingSimulation {
    public static void main(String[] args) {

        StockMarket market = new StockMarket(75.0);

        TradingBot trendBot = new TrendFollowerBot("Trend AI");
        TradingBot shortBot = new ShortSellingBot("Short AI");

        TradingBot[] bots = { trendBot, shortBot };

        // Run 5 rounds
        for (int round = 1; round <= 5; round++) {
            System.out.println("\n=== Round " + round + " ===");
            market.updateMarket();

            for (TradingBot bot : bots) {
                bot.makeDecision(market);
            }
        }

        System.out.println("\n=== Simulation Complete ===");
        System.out.printf("Final Stock Price: $%.2f%n", market.getStockPrice());
        System.out.printf("Trend AI - Balance: $%.2f | Stocks Owned: %d%n",
                trendBot.balance, trendBot.stocksOwned);
        System.out.printf("Short AI - Balance: $%.2f | Stocks Owned: %d%n",
                shortBot.balance, shortBot.stocksOwned);
    }
}