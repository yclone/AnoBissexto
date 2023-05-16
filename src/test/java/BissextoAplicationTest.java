import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BissextoAplicationTest {

    @Test
    public void trueTestesAno1600(){
        BissextoAplication app = new BissextoAplication();
        assertEquals(true, app.application(1600));
    }

    @Test
    public void trueTestesAno2004(){
        BissextoAplication app = new BissextoAplication();
        assertEquals(true, app.application(2004));
    }

    @Test
    public void falseTestesAno2017(){
        BissextoAplication app = new BissextoAplication();
        assertEquals(false, app.application(2017));
    }

    @Test
    public void falseTestesAno600(){
        BissextoAplication app = new BissextoAplication();
        assertEquals(false, app.application(600));
    }

}
