package homework29.open_closed_principle;

//Нарушение:
public class DiscountCalculator_false {
    public double calculate(double price, String discountType) {
        if ("fixed".equals(discountType)) {
            return price - 10;
        } else if ("percentage".equals(discountType)) {
            return price * 0.9;
        }
        return price;
    }
}