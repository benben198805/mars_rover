/**
 * Created by ben on 16-1-13.
 */
public final class Rover {
    private String[] mapSize;
    private Location location;
    private String orders;

    public Rover(String mapSize) {
        this.mapSize=mapSize.split(" ");
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
                    location.setOrientation("W");
                    break;
            }

        }
    }

}
