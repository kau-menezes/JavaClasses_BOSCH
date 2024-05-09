package coingame;

public class Grumpy extends Individual{

    public boolean tricked = false;

    @Override
    boolean play() {

        // custo da máquina + custo de sobrevivência
        this.coins-= 2;

        return (tricked == false ?  true :  false); 
    }

    @Override
    void calc(boolean oponentPlay) {
        if (oponentPlay == false) {
            this.tricked = true;
        }
    }

    @Override
    Individual copy() {

        Grumpy clone = new Grumpy();
        return clone;
    }

    @Override
    String print() {
        return "Grumpy";
    }
}
