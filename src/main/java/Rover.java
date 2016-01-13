public final class Rover {
    private int[] mapSize;
    private Location location;
    private Direction orientation;
    private String orders;


    public Rover(String mapSize) {
        String[] map=mapSize.split(" ");
        if(map.length!=2)
        {
            throw new IllegalArgumentException("mapSize`s must be 2");
        }
        {
            this.mapSize=new int[2];
            try{
                this.mapSize[0]=Integer.parseInt(map[0]);
                this.mapSize[1]=Integer.parseInt(map[1]);
            }
            catch (IllegalArgumentException ex)
            {
                throw new IllegalArgumentException("mapSize must be alphabet");
            }
        }

    }


    public void Init(String location) {
        String[] locationTemp=location.split(" ");
        if(locationTemp.length!=3)
        {
            throw new IllegalArgumentException("locationArg`s must be 3");
        }
        {
            try{
                this.location=new Location(Integer.parseInt(locationTemp[0]),Integer.parseInt(locationTemp[1]));
            }
            catch (IllegalArgumentException ex)
            {
                throw new IllegalArgumentException("location must be alphabet");
            }

            try{
                setOrientation(locationTemp[2]);
            }
            catch (IllegalArgumentException ex)
            {
                throw new IllegalArgumentException("orietation is error");
            }
        }



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
                    if(location.checkMove(orientation,mapSize))
                    {
                        location.move(orientation);
                    }
                    break;
            }
        }
    }
}
