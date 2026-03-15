package Ai_Bot;

public class StockMarket {
    private double stockPrice;

    public StockMarket(double initialPrice) {
        this.stockPrice = initialPrice;
    }

    public void updateMarket() {
        double change = (Math.random() * 10) - 5; // Random change between -5 and +5
        stockPrice += change;
        stockPrice = Math.round(stockPrice * 100.0) / 100.0;
        System.out.printf("Market Update: Stock price is now $%.2f%n", stockPrice);
    }

    public double getStockPrice() {
        return stockPrice;
    }
}