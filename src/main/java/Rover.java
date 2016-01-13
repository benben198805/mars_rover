import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 16-1-13.
 */
public final class Rover {
    private String[] mapSize;
    private Location location;
    private String orders;
    public List<String> direction;


    public Rover(String mapSize) {
        this.mapSize=mapSize.split(" ");
        direction = new ArrayList<String>();
        direction.add("W");
        direction.add("N");
        direction.add("E");
        direction.add("S");

    }

    public void Init(String location) {
        String[] locationTemp=location.split(" ");
        this.location=new Location(Integer.parseInt(locationTemp[0]),Integer.parseInt(locationTemp[1]),locationTemp[2]);
    }

    public String ShowLocation() {
        return location.ShowLocation();
    }

    public void TakeOrder(String order) {
        this.orders=order;
        for(int index=0;index<orders.length();index++)
        {
            switch (this.orders.charAt(index))
            {

                case 'L':
                    if(direction.indexOf(location.getOrientation())==0)
                    {
                        location.setOrientation(direction.get(direction.size()-1));
                    }
                    else
                    {
                        location.setOrientation(direction.get(direction.indexOf(location.getOrientation())-1));
                    }
                    break;

                case 'R':
                    if(direction.indexOf(location.getOrientation())==direction.size()-1)
                    {
                        location.setOrientation(direction.get(0));
                    }
                    else
                    {
                        location.setOrientation(direction.get(direction.indexOf(location.getOrientation())+1));
                    }
                    break;

                case 'M':
                    location.setLocationY(location.getLocationY()+1);

                    break;
            }

        }
    }

}
