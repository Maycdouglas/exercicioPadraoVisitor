public class ExpirationCalculator implements FoodVisitor {

    public String calculateExpiration(FoodItem foodItem){
        return foodItem.accept(this);
    }

    @Override
    public String visit(Biscuit biscuit){
        return biscuit.getName() + " vence em: 20/02/2025";
    }

    @Override
    public String visit(Chocolate chocolate){
        return chocolate.getName() + " vence em: 21/02/2025";
    }

    @Override
    public String visit(Snack snack){
        return snack.getName() + " vence em: 22/02/2025";
    }

}
