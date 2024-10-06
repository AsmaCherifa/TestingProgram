import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSum() {
        App app = new App();
        assertEquals(8, app.sum(5, 3)); // 5 + 3 = 8
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(2, app.subtract(5, 3)); // 5 - 3 = 2
    }

    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(15, app.multiply(5, 3)); // 5 * 3 = 15
    }

    
    @Test
    public void testDivide() {
        App app = new App();
        assertEquals(1.6666667, app.divide(5, 3), 0.0001);
    }

    @Test
    public void testModulus() {
        App app = new App();
        assertEquals(2, app.modulus(5, 3));
    }

    @Test
    public void testPower() {
        App app = new App();
        assertEquals(125.0, app.power(5, 3), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        App app = new App();
        assertEquals(5.0, app.squareRoot(25), 0.0001);
    }



    @Test
    public void testModulusByZero() {
        App app = new App();
        assertEquals(0, app.modulus(5, 0));
    }
  
}
