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



    @Test
    public void shoule_return_S_orietation_when_init_11E_and_takeOrder_R() throws Exception {
        String initLocation="1 1 E";


        rover.Init(initLocation);
        rover.TakeOrder("R");

        String resultLocation="1 1 S";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


    @Test
    public void shoule_return_12N_orietation_when_init_11N_and_takeOrder_M() throws Exception {
        String initLocation="1 1 N";


        rover.Init(initLocation);
        rover.TakeOrder("M");

        String resultLocation="1 2 N";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


    @Test
    public void shoule_return_11N_orietation_when_init_11N_and_takeOrder_LRLR() throws Exception {
        String initLocation="1 1 N";

        rover.Init(initLocation);
        rover.TakeOrder("LRLR");

        String resultLocation="1 1 N";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }

    @Test
    public void shoule_return_12E_orietation_when_init_11N_and_takeOrder_RM() throws Exception {
        String initLocation="1 1 N";

        rover.Init(initLocation);
        rover.TakeOrder("RM");

        String resultLocation="2 1 E";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }

    @Test
    public void shoule_return_22N_orietation_when_init_11N_and_takeOrder_RMLRLM() throws Exception {
        String initLocation="1 1 N";

        rover.Init(initLocation);
        rover.TakeOrder("RMLRLM");

        String resultLocation="2 2 N";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


    @Test
    public void shoule_return_11N_orietation_when_init_11N_and_takeOrder_LM() throws Exception {
        String initLocation="1 1 N";

        rover.Init(initLocation);
        rover.TakeOrder("LM");

        String resultLocation="1 1 W";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }

    @Test
    public void shoule_return_51E_orietation_when_init_51E_and_takeOrder_M() throws Exception {
        String initLocation="5 1 E";

        rover.Init(initLocation);
        rover.TakeOrder("M");

        String resultLocation="5 1 E";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


    @Test
    public void shoule_return_15N_orietation_when_init_15N_and_takeOrder_M() throws Exception {
        String initLocation="1 5 N";

        rover.Init(initLocation);
        rover.TakeOrder("M");

        String resultLocation="1 5 N";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }


    @Test
    public void shoule_return_51S_orietation_when_init_51S_and_takeOrder_M() throws Exception {
        String initLocation="5 1 S";

        rover.Init(initLocation);
        rover.TakeOrder("M");

        String resultLocation="5 1 S";
        Assert.assertThat(rover.ShowLocation(),is(resultLocation));
    }

}