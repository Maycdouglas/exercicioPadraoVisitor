import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpirationCalculatorTest {

    @Test
    public void deveRetornarValidadeSobreSalgadinho(){
        Snack snack = new Snack("Salgadinho", 10);

        ExpirationCalculator expirationCalculator = new ExpirationCalculator();
        assertEquals("Salgadinho vence em: 22/02/2025", expirationCalculator.calculateExpiration(snack));
    }

    @Test
    public void deveRetornarValidadeSobreChocolate(){
        Chocolate chocolate = new Chocolate("Chocolate", 10);

        ExpirationCalculator expirationCalculator = new ExpirationCalculator();
        assertEquals("Chocolate vence em: 21/02/2025", expirationCalculator.calculateExpiration(chocolate));
    }

    @Test
    public void deveRetornarValidadeSobreBiscoito(){
        Biscuit biscuit = new Biscuit("Biscoito", 10);

        ExpirationCalculator expirationCalculator = new ExpirationCalculator();
        assertEquals("Biscoito vence em: 20/02/2025", expirationCalculator.calculateExpiration(biscuit));
    }

}