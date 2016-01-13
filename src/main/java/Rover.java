import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Rover {
    private int[] mapSize;
    private Location location;
    private Direction orientation;
    private String orders;


    public Rover(String mapSize) {
        Pattern mapSizePattern= Pattern.compile("\\d \\d");
        Matcher mapSizeMatcher=mapSizePattern.matcher(mapSize);
        boolean isMatchFormat=mapSizeMatcher.matches();
        if(isMatchFormat)
        {
            String[] map=mapSize.split(" ");
            this.mapSize=new int[2];
            this.mapSize[0]=Integer.parseInt(map[0]);
            this.mapSize[1]=Integer.parseInt(map[1]);
        }
        else
        {
            throw new IllegalArgumentException("mapSize is not right format");
        }
    }


    public void Init(String location) {
        Pattern locationPattern= Pattern.compile("\\d \\d [WNES]");
        Matcher locationMatcher=locationPattern.matcher(location);
        boolean isMatchFormat=locationMatcher.matches();
        if(isMatchFormat)
        {
            String[] locationTemp=location.split(" ");
            this.location=new Location(Integer.parseInt(locationTemp[0]),Integer.parseInt(locationTemp[1]));
            setOrientation(locationTemp[2]);
        }
        else
        {
            throw new IllegalArgumentException("location is not right format");
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
