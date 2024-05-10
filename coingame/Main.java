package coingame;

public class Main {

    public static void main (String []args) {

        // instancia a classe World
        World world = new World(50, 150, 50, 50, 100);

        // play!!
        world.round(world.population);

        //statistics:
        System.out.println("\n=== ESTATÍSTICAS ===\n");
        System.out.println("\n=== Total de vivos da população: " + world.currentSize);
        System.out.println("\n=== Total de mortes: " + world.totalDeaths);
        System.out.println("\n=== Total de clones: " + world.totalClones);


        // 1) pop. atual - 2)quantos se clonaram - 3) quantos morreram - 
        System.err.println();

    }
}
