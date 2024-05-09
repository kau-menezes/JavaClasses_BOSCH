package coingame;

public class Main {

    public static void main (String []args) {

        // instancia a classe World
        World world = new World(150, 200, 50, 50, 50);

        // play!!
        world.round(world.population);

    }
}
