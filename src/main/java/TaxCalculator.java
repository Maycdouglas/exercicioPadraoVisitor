public class TaxCalculator implements FoodVisitor {

    public String calculateTax(FoodItem foodItem){
        return foodItem.accept(this);
    }

    @Override
    public String visit(Biscuit biscuit){
        return "Imposto sobre " + biscuit.getName() + ": " + (biscuit.getPricePerUnit() * 0.05) + " (5%)";
    }

    @Override
    public String visit(Chocolate chocolate){
        return "Imposto sobre " + chocolate.getName() + ": " + (chocolate.getPricePerUnit() * 0.05) + " (5%)";
    }

    @Override
    public String visit(Snack snack){
        return "Imposto sobre " + snack.getName() + ": " + (snack.getPricePerUnit() * 0.05) + " (5%)";
    }
}
