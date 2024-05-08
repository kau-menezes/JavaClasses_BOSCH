package coingame;

public class World {
    public int totalCheaters;
    public int totalCooperators;
    public int totalGrumpys;
    public int totalCopycats;
    public int totalTolerants;

    private int currentSize = 0;

    public Individual[] population = new Individual[500];

    World(int totalCheaters, int totalCooperators, int totalGrumpys, int totalCopycats, int totalTolerants) {
        this.totalCheaters = totalCheaters;
        this.totalCooperators = totalCooperators;
        this.totalGrumpys = totalGrumpys;
        this.totalCopycats = totalCopycats;
        this.totalTolerants = totalTolerants;

    }

    public void push(Individual value) {
        
        //provavelmente se eu alterar a ordem das duas linhas e retirae o -1 daria certo mas eu não sou LOUCA de tentar
        currentSize++;
        population[currentSize - 1] = value;
        
    }

    public void addIndividuals() {

        // if feiúra 😔😓
        if (this.totalCheaters != 0) {

            // instancia um mano 
            Cheater cheater = new Cheater();

            // bota cada um dos mano na stack
            for (int i = 0; i < this.totalCheaters; i++) {
                push(cheater);
            }

        } 
        
        if (this.totalCooperators != 0) {

            Cooperator cooperator = new Cooperator();

            for (int i = 0; i < this.totalCooperators; i++) {
                push(cooperator);
            }

        }

        if (this.totalGrumpys != 0) {

            Grumpy grumpy = new Grumpy();

            for (int i = 0; i < this.totalCooperators; i++) {
                push(grumpy);
            }

        }

        if (this.totalCopycats != 0) {

             Copycat copycat = new Copycat();

            for (int i = 0; i < this.totalCooperators; i++) {
                push(copycat);
            }

        }

        
    }

}
