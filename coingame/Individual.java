package coingame;

abstract public class Individual {
    public int coins = 10;
    public boolean alive = true;

    abstract boolean play();
    // abstract Individual copy();

}
