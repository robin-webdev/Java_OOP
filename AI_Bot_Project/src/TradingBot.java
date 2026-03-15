package Ai_Bot;

public class TradingBot {
    protected String botName;
    protected double balance;
    protected int stocksOwned;

    public TradingBot(String botName) {
        this.botName = botName;
        this.balance = 1000.0;
        this.stocksOwned = 10;
    }

    public void makeDecision(StockMarket market) {
        System.out.println(botName + " is analyzing the market...");
    }

    public void buyStocks(int amount, StockMarket market) {
        double cost = amount * market.getStockPrice();
        if (balance >= cost) {
            balance -= cost;
            stocksOwned += amount;
            System.out.printf("%s: bought %d stocks at $%.2f each. New Balance: $%.2f%n",
                    botName, amount, market.getStockPrice(), balance);
        } else {
            System.out.printf("%s: insufficient balance to buy %d stocks.%n", botName, amount);
        }
    }

    public void sellStocks(int amount, StockMarket market) {
        if (stocksOwned >= amount) {
            balance += amount * market.getStockPrice();
            stocksOwned -= amount;
            System.out.printf("%s: sold %d stocks at $%.2f each. New Balance: $%.2f%n",
                    botName, amount, market.getStockPrice(), balance);
        } else {
            System.out.printf("%s: not enough stocks to sell %d.%n", botName, amount);
        }
    }
}