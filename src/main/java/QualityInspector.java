public class QualityInspector implements FoodVisitor {

    public String inspectQuality(FoodItem foodItem){
        return foodItem.accept(this);
    }

    @Override
    public String visit(Biscuit biscuit){
        return "Inspecionando " + biscuit.getName() + ". (APROVADO)";
    }

    @Override
    public String visit(Chocolate chocolate){
        return "Inspecionando " + chocolate.getName() + ". (APROVADO)";
    }

    @Override
    public String visit(Snack snack){
        return "Inspecionando " + snack.getName() + ". (APROVADO)";
    }
}
