package edu.neu.csye7374;

public class EnergyStockStrategy implements PricingStrategy {
    @Override
    public double calculateNewPrice(double currentPrice, double bid) {
        
        return currentPrice * 0.97 + bid * 0.05; // 3% decrease plus 5% of bid
    }
}
