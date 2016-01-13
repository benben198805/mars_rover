/**
 * Created by ben on 16-1-13.
 */
public final class Rover {
    private String[] mapSize;
    private String[] location;
    private String orders;

    public Rover(String mapSize) {
        this.mapSize=mapSize.split(" ");
    }

    public void Init(String location) {
        this.location=location.split(" ");
    }

    public String[] ShowLocation() {
        return location;
    }

    public void TakeOrder(String orders) {
        this.orders=orders;
    }

}
