package coingame;

public class Tolerant extends Individual {

    public int timesTricked = 0;
    public int timesItTricked = 0;

    @Override
    int play() {
        if (this.timesTricked == 3 && this.timesItTricked < 3) {
            this.timesItTricked++;
            return 0;

        } else {
            this.timesItTricked = 0;
            this.timesTricked = 0;
            return 1;
        } 
    }
}
