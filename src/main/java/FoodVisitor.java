public interface FoodVisitor {

    String visit(Biscuit biscuit);
    String visit(Chocolate chocolate);
    String visit(Snack snack);

}
