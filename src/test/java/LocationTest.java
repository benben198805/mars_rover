import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class LocationTest {
    private Location location;
    @Before
    public void setUp() throws Exception {
        location=new Location(1,1,"N");
    }

    @Test
    public void should_return_init_location_when_use_showLocation() throws Exception {
        String result=location.ShowLocation();

        Assert.assertThat(result,is("1 1 N"));
    }


    @Test
    public void should_return_11W_location_when_set_orientation() throws Exception {
        location.setOrientation("W");
        String result=location.ShowLocation();

        Assert.assertThat(result,is("1 1 W"));
    }


    @Test
    public void should_return_21N_location_when_set_locationX() throws Exception {
        location.setLocationX(2);
        String result=location.ShowLocation();

        Assert.assertThat(result,is("2 1 N"));
    }


    @Test
    public void should_return_12N_location_when_set_locationX() throws Exception {
        location.setLocationY(2);
        String result=location.ShowLocation();

        Assert.assertThat(result,is("1 2 N"));
    }


}