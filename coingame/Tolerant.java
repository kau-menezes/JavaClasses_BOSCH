package coingame;

public class Tolerant extends Individual {

    public int timesTricked = 0;
    public int timesItTricked = 0;

    @Override
    boolean play() {

        this.coins--;

        if (this.timesTricked == 3 && this.timesItTricked < 3) {
            this.timesItTricked++;
            return false;

        } else {
            this.timesItTricked = 0;
            this.timesTricked = 0;
            return true;
        } 
    }

    @Override
    void calc(boolean oponentPlay) {
        if (oponentPlay == false) {
            this.timesTricked ++;
        }
    }

    @Override
    Individual copy() {

        Tolerant clone = new Tolerant();
        return clone;
    }
}
