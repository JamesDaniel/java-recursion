import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void rightAlign_Test() {
        String expect = "          as";
        String actual = Application.rightAlign("as");

        assertEquals(expect, actual);
    }

    @Test
    public void nextMultipleOf5From_Test() {
        int expect = 10;
        int actual = Application.nextMultipleOf5From(6);

        assertEquals(expect, actual);
    }

}
