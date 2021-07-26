import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BissextoAplicationTest{

    @Test
    public void testes(){
        BissextoAplication app = new BissextoAplication();

        Assertions.assertEquals(true, app.application(1600));
        Assertions.assertEquals(true, app.application(2004));
        Assertions.assertEquals(false, app.application(2017));
        Assertions.assertEquals(false, app.application(600));
    }
}
