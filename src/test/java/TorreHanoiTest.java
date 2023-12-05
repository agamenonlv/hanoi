import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TorreHanoiTest {

    @Test
    public void verificaTorreHanoiPadrao()
    {
        TorreHanoi torre1 = new TorreHanoi();
        TorreHanoi torre2 = new TorreHanoi();
        TorreHanoi torre3 = new TorreHanoi();
        TorreHanoi torre4 = new TorreHanoi();

        torre1.setDiscos(-2);
        torre2.setDiscos(0);
        torre3.setDiscos(1);
        torre4.setDiscos(3);

        assertEquals(1,torre1.getDiscos());
        assertEquals(1,torre2.getDiscos());
        assertEquals(1,torre1.resolverTorreHanoi());
        assertEquals(1,torre2.resolverTorreHanoi());
        assertEquals(1,torre3.resolverTorreHanoi());
        assertEquals(1,torre3.resolverTorreHanoi());
    }

    @Test
    public void verificaTorreHanoi()
    {
        TorreHanoi torre1 = new TorreHanoi(-2);
        TorreHanoi torre2 = new TorreHanoi(0);
        TorreHanoi torre3 = new TorreHanoi(1);
        TorreHanoi torre4 = new TorreHanoi(3);

        assertEquals(1,torre1.resolverTorreHanoi());
        assertEquals(1,torre2.resolverTorreHanoi());
        assertEquals(1, torre3.resolverTorreHanoi());
        assertEquals(7,torre4.resolverTorreHanoi());
    }
}
