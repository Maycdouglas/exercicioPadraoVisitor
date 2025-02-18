import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {

    @Test
    public void deveRetornarImpostoSobreSalgadinho(){
        Snack snack = new Snack("Salgadinho", 10);

        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals("Imposto sobre Salgadinho: 0.5 (5%)", taxCalculator.calculateTax(snack));
    }

    @Test
    public void deveRetornarImpostoSobreChocolate(){
        Chocolate chocolate = new Chocolate("Chocolate", 10);

        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals("Imposto sobre Chocolate: 0.5 (5%)", taxCalculator.calculateTax(chocolate));
    }

    @Test
    public void deveRetornarImpostoSobreBiscoito(){
        Biscuit biscuit = new Biscuit("Biscoito", 10);

        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals("Imposto sobre Biscoito: 0.5 (5%)", taxCalculator.calculateTax(biscuit));
    }

}