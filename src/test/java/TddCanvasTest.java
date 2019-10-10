import org.junit.Assert;
import org.junit.Test;

public class TddCanvasTest {

    @Test
    public void testRetornaVerdadero() {
        TddCanvas tddCanvas = new TddCanvas();
        Assert.assertTrue(tddCanvas.retornaVerdadero());
    }

    @Test
    public void testRetornaFalso() {
        TddCanvas tddCanvas = new TddCanvas();
        Assert.assertFalse(tddCanvas.retornaFalso());
    }
}