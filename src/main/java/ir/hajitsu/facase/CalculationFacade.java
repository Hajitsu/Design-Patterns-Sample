package ir.hajitsu.facase;

public class CalculationFacade {
    private BasePremiumCalculation basePremiumCalculation;
    private DiscountCalculation discountCalculation;
    private TaxCalculation taxCalculation;

    public CalculationFacade() {
        basePremiumCalculation = new BasePremiumCalculation();
        discountCalculation = new DiscountCalculation();
        taxCalculation = new TaxCalculation();
    }

    public BasePremiumCalculation getBasePremiumCalculation() {
        return basePremiumCalculation;
    }
}
