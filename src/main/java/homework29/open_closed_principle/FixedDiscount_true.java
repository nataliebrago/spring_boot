package homework29.open_closed_principle;

class FixedDiscount_true implements DiscountInterface_true {
    @Override
    public double apply(double price) {
        return price - 10;

    }
}