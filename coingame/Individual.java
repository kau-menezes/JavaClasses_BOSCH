package coingame;

abstract public class Individual {
    private int coins = 10;
    
    
    public boolean alive = true;
    
    abstract boolean play();
    
    abstract Individual copy();
    
    abstract void calc(boolean oponentPlay);
    
    abstract String print();
    
    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
