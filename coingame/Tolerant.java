package coingame;

public class Tolerant extends Individual {

    public int timesTricked = 0;
    public int timesItTricked = 0;

    @Override
    boolean play() {
        if (this.timesTricked == 3 && this.timesItTricked < 3) {
            this.timesItTricked++;
            return false;

        } else {
            this.timesItTricked = 0;
            this.timesTricked = 0;
            return true;
        } 
    }
}
