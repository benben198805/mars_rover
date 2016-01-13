public class Location {
    private int locationX;
    private int locationY;

    public Location(int locationX, int locationY) {
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }


    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }


    public String ShowLocation()
    {
        String result=String.valueOf(locationX)+" "+String.valueOf(locationY);
        return result;
    }

    public void move(Direction orientation) {
        switch (orientation)
        {
            case N:
                    this.locationY++;
                break;

            case S:
                    this.locationY--;
                break;

            case W:
                    this.locationX--;
                break;

            case E:
                    this.locationX++;
                break;
        }
    }

    public boolean checkMove(Direction orientation,int[] mapSize) {
        boolean isNotMove =true;
        switch (orientation)
        {
            case N:
                isNotMove =this.locationY==mapSize[1];
                break;
            case S:
                isNotMove =locationY==1;
                break;
            case W:
                isNotMove =locationX==1;
                break;
            case E:
                isNotMove =locationX==mapSize[1];
                break;
        }
        return !isNotMove;
    }
}
