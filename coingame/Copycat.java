package coingame;

public class Copycat extends Individual{
    
    public boolean tricked = false;

    @Override
    int play() {
        int returnValue = (tricked == false ?  1 :  0); 
        return returnValue;
    }
}
