package homework29.open_closed_principle;

class PercentageDiscount_true implements DiscountInterface_true {
    @Override
    public double apply(double price) {
        return price * 0.9;
    }
}