package homework29.open_closed_principle;

public class DiscountCalc_true {
    public double calculate(double price, DiscountInterface_true discount) {
        return discount.apply(price);
    }
}