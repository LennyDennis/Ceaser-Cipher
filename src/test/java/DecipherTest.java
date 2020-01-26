import org.junit.*;
import static  org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DecipherTest {
    @Test
    public void theText_shouldBeTheText_hello(){
        Decipher textInput = new Decipher("jgnnq",2);
        assertEquals("jgnnq" ,textInput.getText());
    }

}

