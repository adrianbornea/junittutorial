import org.hamcrest.core.Is;
import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrackingServiceTest {

    TrackingService service = null;

    @Before
    public void setup() {
        service = new TrackingService();
    }

    @Test
    @Category(GoodTestsCategory.class)
    public void newTrackingServiceTotalIsZero() {
        assertEquals("Tracking service total was not zero", 0, service.getTotal());
    }

    @Test
    @Category(GoodTestsCategory.class)
    public void whenAddingProteinTotalIncreasesByThatAmount() {
        service.addProtein(100);
        assertEquals("Protein total was not correct!", 100, service.getTotal());
    }

    @Test
    @Category(GoodTestsCategory.class)
    public void whenRemovingProteinTotalDecreasesByThatAmount() {
        service.addProtein(100);
        service.removeProtein(50);
        assertEquals("Protein total was not decreased by the right amount!", 50, service.getTotal());
        assertThat(service.getTotal(), is(50));
    }

    @Test
    @Ignore
    public void getTotalReturnsTheRightAmount() {
        service.addProtein(40);
        service.addProtein(34);
        service.removeProtein(14);
        assertEquals("The total is not correct", 60, service.getTotal());
    }

    @Test(expected = InvalidGoalException.class)
    public void whenGoalIsSetToLessThanZeroExceptionExpected() throws InvalidGoalException {
        service.setGoal(-10);
    }

    @Test(timeout = 100)
    public void printALotOfNumbers() {
        for (int i = 0; i < 800000; i++) {
            if (i%100 == 0) {
                System.out.println(i);
            }
        }
    }






}