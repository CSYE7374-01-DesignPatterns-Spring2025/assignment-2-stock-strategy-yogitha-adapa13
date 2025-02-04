package edu.neu.csye7374;

public class BearMarketStrategy implements PricingStrategy {
    @Override
    public double calculateNewPrice(double currentPrice, double bid) {
        // Implementing a BearMarket strategy by decreasing the price
        return currentPrice * 0.95 + bid * 0.01; // 5% decrease + 1% of bid
    }
}
