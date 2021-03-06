
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArithTest {
    @Test
    @Points("arith-funcs")
    public void testAdd() {
        assertEquals(10, Arith.add(5, 5));
    }
    
    @Test
    @Points("arith-funcs")
    public void testSub() {
        assertEquals(4, Arith.sub(8, 4, 0));
    }
    
    @Test
    @Points("arith-funcs")
    public void testMul() {
        assertEquals(12, Arith.mul(3, 4));
    }
    
    @Test
    @Points("arith-funcs")
    public void testDiv() {
        assertEquals(0, Arith.div(3, 4));
        assertEquals(3, Arith.div(7, 2));
    }
}
