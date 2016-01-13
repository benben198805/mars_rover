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
    public void testTakeOrder() throws Exception {

    }

    @Test
    public void shoule_return_same_location_when_user_init() throws Exception {
        String initLocation="1 1 N";

        rover.Init(initLocation);

        String[] location={"1","1","N"};
        Assert.assertThat(rover.ShowLocation(),is(location));
    }
}