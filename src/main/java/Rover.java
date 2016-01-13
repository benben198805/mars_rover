public final class Rover {
    private String[] mapSize;
    private Location location;
    private Direction orientation;
    private String orders;


    public Rover(String mapSize) {
        this.mapSize=mapSize.split(" ");

    }


    public void Init(String location) {
        String[] locationTemp=location.split(" ");
        this.location=new Location(Integer.parseInt(locationTemp[0]),Integer.parseInt(locationTemp[1]));
        setOrientation(locationTemp[2]);
    }



    public void setOrientation(String orientation) {
        switch (orientation)
        {
            case "W":
                this.orientation=Direction.W;
                break;
            case "N":
                this.orientation=Direction.N;
                break;
            case "E":
                this.orientation=Direction.E;
                break;
            case "S":
                this.orientation=Direction.S;
                break;
        }
    }

    public String ShowLocation() {

        return location.ShowLocation()+" "+orientation.toString();
    }

    public void TakeOrder(String order) {
        this.orders=order;
        for(int index=0;index<orders.length();index++)
        {
            switch (this.orders.charAt(index))
            {
                case 'L':
                    orientation=orientation.left();
                    break;

                case 'R':
                    orientation=orientation.right();
                    break;

                case 'M':
                    location.move(orientation);
                    break;
            }
        }
    }
}
