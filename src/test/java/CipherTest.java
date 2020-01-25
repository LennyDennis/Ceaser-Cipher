import org.junit.*;
import static  org.junit.Assert.*;

public class CipherTest {
    @Test
    public void theString_shouldBeAString_hello(){
        Cipher stringInput = new Cipher("hello",2);
        assertEquals("hello" ,stringInput.getText());
    }
//    @Test
//    public void isInteger_shouldBeAnInteger_true(){
//        Cipher stringInput = new Cipher("hello",2);
//        assertEquals(true ,stringInput.getKey().getClass());
//    }
//      @Test
//        public void encyrpt_text


}
