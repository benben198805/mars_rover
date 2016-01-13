/**
 * Created by ben on 16-1-13.
 */
public class Location {
    private int LocationX;
    private int LocationY;
    private String orientation;

    public Location(int locationX, int locationY, String orientation) {
        this.LocationX = locationX;
        this.LocationY = locationY;
        this.orientation = orientation;
    }


    public String ShowLocation()
    {
        String result=String.valueOf(LocationX)+" "+String.valueOf(LocationY)+" "+orientation;
        return result;
    }
}
