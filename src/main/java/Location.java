import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 16-1-13.
 */
public class Location {
    private int locationX;
    private int locationY;
    private String orientation;
    private List<String> direction;

    public Location(int locationX, int locationY, String orientation) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.orientation = orientation;
        direction = new ArrayList<String>();
        direction.add("W");
        direction.add("N");
        direction.add("E");
        direction.add("S");
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String ShowLocation()
    {
        String result=String.valueOf(locationX)+" "+String.valueOf(locationY)+" "+orientation;
        return result;
    }

    public void move() {
        switch (this.orientation)
        {
            case "N":
                    this.locationY++;
                break;

            case "S":
                    this.locationY--;
                break;

            case "W":
                    this.locationX--;
                break;

            case "E":
                    this.locationX++;
                break;
        }
    }

    public void turnLeft() {
        if(direction.indexOf(orientation)==0)
        {
            orientation=direction.get(direction.size()-1);
        }
        else
        {
            orientation=direction.get(direction.indexOf(orientation)-1);
        }
    }

    public void turnRight() {
        if(direction.indexOf(orientation)==direction.size()-1)
        {
            orientation=direction.get(0);
        }
        else
        {
            orientation=direction.get(direction.indexOf(orientation)+1);
        }
    }
}
