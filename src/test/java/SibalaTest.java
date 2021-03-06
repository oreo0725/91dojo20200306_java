import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.*;

/**
 * @author zen
 * @since 2021/3/6
 */
public class SibalaTest {

    @Test
    void testGetResult_Tie() {


        Sibala sibala =new Sibala();
        String result = sibala.getResult("A:1 3 5 6  B:1 2 3 4");

    }
}
