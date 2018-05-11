import org.junit.Test;

import static org.junit.Assert.*;

public class TrackingServiceTest {

    @Test
    public void newTrackingServiceTotalIsZero() {
        TrackingService service = new TrackingService();
        assertEquals("Tracking service total was not zero", 0, service.getTotal());
    }

    @Test
    public void whenAddingProteinTotalIncreasesByThatAmount() {
        TrackingService service = new TrackingService();
        service.addProtein(100);
        assertEquals("Protein total was not correct!", 100, service.getTotal());
    }


}