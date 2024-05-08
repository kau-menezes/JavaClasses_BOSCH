package coingame;

abstract public class Individual {
    public int coins = 10;
    public boolean alive = true;

    abstract int play();
    // abstract Individual copy();

}
