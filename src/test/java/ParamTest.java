import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParamTest {

    private static TrackingService service = new TrackingService();
    private int input;
    private int expected;


    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {5,5},
                {5, 10},
                {-10, 0},
                {50, 50},
                {1, 51}

        });
    }

    public ParamTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        if(input >= 0) {
            service.addProtein(input);
        } else {
            service.removeProtein(-input);
        }
        assertEquals(expected,service.getTotal());
    }

}
