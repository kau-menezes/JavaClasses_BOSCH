package coingame;

import java.util.Random;

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

            for (int i = 0; i < this.totalGrumpys; i++) {
                push(grumpy);
            }

        }

        if (this.totalCopycats != 0) {

             Copycat copycat = new Copycat();

            for (int i = 0; i < this.totalCopycats; i++) {
                push(copycat);
            }

        }

        if (this.totalTolerants != 0) {

            Tolerant tolerant = new Tolerant();

           for (int i = 0; i < this.totalTolerants; i++) {
               push(tolerant);
           }

       }
        
    }

    public int verifyCoins(Individual player) {
        if (player.coins == 0) {
            return -1;

        } else if (player.coins >= 20) {
            return 1;

        } else {
            return 0;
        }

    }

    public void playerStaus(Individual player, int value) {
        
        if (value == -1) {
            player.alive = false;

        } else if (value == 1) {
            // multiplica Senhor

        } 
    }

    public void round(Individual[] array, Individual first, Individual second) {

        //instancia um objeto da classe Random
        Random random = new Random();

        // guarda números aleatórios em duas variáveis diferentes
        int rnd1 = random.nextInt(currentSize + 1);
        int rnd2 = random.nextInt(currentSize + 1);

        // impede a geração de dois números iguais
        if (rnd1 == rnd2) {
            while (rnd1 == rnd2) {
                rnd2 = random.nextInt(currentSize + 1);
            }
        }

        // define duas variáveis que guardarão os jogadores
        Individual playerOne = array[rnd1];
        Individual playerTwo = array[rnd2];

        // play!
        boolean playOne = playerOne.play();
        boolean playTwo = playerTwo.play();

        // os dois cooperam
        if (playOne == true && playOne == playTwo) {
            playerOne.coins++;
            playerTwo.coins++;

        // playerOne coopera e playerTwo trapaceia
        } else if (playOne == true && playOne != playTwo) {
            playerTwo.coins += 4;

        // playerOne traapceia e playerTwo coopera
        } else if (playOne == false && playOne != playTwo) {
            playerOne.coins += 4;

        }

        // impacto na personalidade dos jogadores
        playerOne.calc(playTwo);
        playerTwo.calc(playOne);

    }
}
