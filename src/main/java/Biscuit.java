public class Biscuit implements FoodItem{

    private String name;
    private double pricePerUnit;

    public Biscuit(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String accept(FoodVisitor visitor) {
        return visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
