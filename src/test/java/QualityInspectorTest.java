import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class QualityInspectorTest {

    @Test
    public void deveRetornarInspecaoSobreSalgadinho(){
        Snack snack = new Snack("Salgadinho", 10);

        QualityInspector qualityInspector = new QualityInspector();
        assertEquals("Inspecionando Salgadinho. (APROVADO)", qualityInspector.inspectQuality(snack));
    }

    @Test
    public void deveRetornarInspecaoSobreChocolate(){
        Chocolate chocolate = new Chocolate("Chocolate", 10);

        QualityInspector qualityInspector = new QualityInspector();
        assertEquals("Inspecionando Chocolate. (APROVADO)", qualityInspector.inspectQuality(chocolate));
    }

    @Test
    public void deveRetornarInspecaoSobreBiscoito(){
        Biscuit biscuit = new Biscuit("Biscoito", 10);

        QualityInspector qualityInspector = new QualityInspector();
        assertEquals("Inspecionando Biscoito. (APROVADO)", qualityInspector.inspectQuality(biscuit));
    }
}