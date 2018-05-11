import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TrackingServiceSecondTest {

    @Test
    @Category(GoodTestsCategory.class)
    public void isGoalMetTest() throws InvalidGoalException {
        TrackingService service = new TrackingService();
        service.addProtein(100);
        service.setGoal(100);
        assertEquals(true,service.isGoalMet());

    }
}