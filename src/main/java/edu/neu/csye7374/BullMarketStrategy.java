package edu.neu.csye7374;

public class BullMarketStrategy implements PricingStrategy {
    @Override
    public double calculateNewPrice(double currentPrice, double bid) {
        // Implementing a BullMarket strategy by increasing the price
        return currentPrice * 1.05 + bid * 0.02; // 5% increase + 2% of bid
    }
}
