import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class LocationTest {
    private Location location;
    @Before
    public void setUp() throws Exception {
        location=new Location(1,1);
    }

    @Test
    public void should_return_init_location_when_use_showLocation() throws Exception {
        String result=location.ShowLocation();

        Assert.assertThat(result,is("1 1"));
    }



    @Test
    public void should_return_21N_location_when_set_locationX() throws Exception {
        location.setLocationX(2);
        String result=location.ShowLocation();

        Assert.assertThat(result,is("2 1"));
    }


    @Test
    public void should_return_12N_location_when_set_locationY() throws Exception {
        location.setLocationY(2);
        String result=location.ShowLocation();

        Assert.assertThat(result,is("1 2"));
    }


    @Test
    public void should_return_21S_when_init_22S_and_move() throws Exception {
        location=new Location(2,2);

        location.move(Direction.S);

        String result=location.ShowLocation();
        Assert.assertThat(result,is("2 1"));
    }

    @Test
    public void should_return_23N_when_init_22N_and_move() throws Exception {
        location=new Location(2,2);

        location.move(Direction.N);

        String result=location.ShowLocation();
        Assert.assertThat(result,is("2 3"));
    }

    @Test
    public void should_return_32E_when_init_22E_and_move() throws Exception {
        location=new Location(2,2);

        location.move(Direction.E);

        String result=location.ShowLocation();
        Assert.assertThat(result,is("3 2"));
    }

    @Test
    public void should_return_12W_when_init_22W_and_move() throws Exception {
        location=new Location(2,2);

        location.move(Direction.W);

        String result=location.ShowLocation();
        Assert.assertThat(result,is("1 2"));
    }



}