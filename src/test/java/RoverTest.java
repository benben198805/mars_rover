import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class RoverTest {
    public Rover rover;

    @Before
    public void setUp() throws Exception {
        rover=new Rover("5 5");
    }


    @Test
    public void shoule_return_same_location_when_use_init() throws Exception {
        String initLocation="1 1 N";

        rover.Init(initLocation);

        Assert.assertThat(rover.ShowLocation(),is(initLocation));
    }


    @Test
    public void shoule_return_W_orietation_when_takeOrder_L() throws Exception {
        String initLocation="1 1 N";


        rover.Init(initLocation);
        rover.TakeOrder("L");

        String resultLocation="1 1 W";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


    @Test
    public void shoule_return_E_orietation_when_takeOrder_L() throws Exception {
        String initLocation="1 1 N";


        rover.Init(initLocation);
        rover.TakeOrder("R");

        String resultLocation="1 1 E";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


}