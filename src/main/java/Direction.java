public enum Direction {
    W,N,E,S;

    public Direction left()
    {
        int index = this.ordinal() - 1;
        return values()[(index+values().length) % values().length];
    }

    public Direction right()
    {
        int index = this.ordinal() + 1;
        return values()[index % values().length];
    }

}
