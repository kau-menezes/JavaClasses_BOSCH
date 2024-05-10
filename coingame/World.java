package coingame;

import java.util.Random;

public class World {
    public int totalCheaters;
    public int totalCooperators;
    public int totalGrumpys;
    public int totalCopycats;
    public int totalTolerants;

    int totalDeaths = 0;
    int totalClones = 0;

    public int currentSize = 0;

    public Individual[] population = new Individual[700];

    World(int totalCheaters, int totalCooperators, int totalGrumpys, int totalCopycats, int totalTolerants) {
        this.totalCheaters = totalCheaters;
        this.totalCooperators = totalCooperators;
        this.totalGrumpys = totalGrumpys;
        this.totalCopycats = totalCopycats;
        this.totalTolerants = totalTolerants;
        addIndividuals();

    }

    public void push(Individual value) {
        
        //provavelmente se eu alterar a ordem das duas linhas e retirae o -1 daria certo mas eu não sou LOUCA de tentar -- eu tava certa obg cristian
        population[currentSize] = value;
        currentSize++;
        
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
    
    // :(
    public void pop(int rndIndex) {
        // for(int i = rndIndex; i < currentSize - 1; i++) {
        //     population[i] = population[i + 1];
        // }
        population[rndIndex] = population[currentSize - 1];
        population[currentSize - 1] = null;

        currentSize--;
    }

    public void taxes(Individual playerOne, Individual playerTwo) {
        playerOne.setCoins(playerOne.getCoins() - 1);
        playerTwo.setCoins(playerTwo.getCoins() - 1);

    }

    // retorna um valor dependente da quantidade de moedas
    public void playerStatus(Individual player, int rndIndex) {
        if (player.getCoins() < 0) {
            player.setAlive(false);
            pop(rndIndex);
            totalDeaths++;
            System.out.println("\nUm " + player.print() + " morreu :(");

        } else if (player.getCoins() >= 20) {
            Individual clone = player.copy();
            push(clone);
            totalClones++;
            player.setCoins(10);
            System.out.println("Um " + player.print() + " foi clonado :)");

        } 

    }

    // o jogo em si
    public void round(Individual[] array) {

        //instancia um objeto da classe Random - seed
        Random random = new Random(System.currentTimeMillis());
        // realiza 250 interações 
        for (int i = 0; i < 500 / 2; i++) {

            System.out.printf("\n===== RODADA: %d =====", i);

    
            // guarda números aleatórios em duas variáveis diferentes
            int rnd1, rnd2;

            Individual playerOne, playerTwo;
            
            // impede a geração de dois números iguais

            rnd1 = random.nextInt(currentSize);
            rnd2 = random.nextInt(currentSize);

            do
            {
                rnd1 = random.nextInt(currentSize);
                rnd2 = random.nextInt(currentSize);

                if (rnd1 == rnd2) {
                    rnd2 = rnd1 + 1;
                }

            } while (!array[rnd1].alive || !array[rnd2].alive);
    
            // define duas variáveis que guardarão os jogadores
            playerOne = array[rnd1];
            playerTwo = array[rnd2];
            System.out.println("\n" + rnd1  + " - " + rnd2);
    
            // play!
            boolean playOne = playerOne.play();
            boolean playTwo = playerTwo.play();

            // voltar com o método abtrato de print();
            System.out.printf("\nPlayer One: %s", playerOne.print());
            System.out.printf("\nPlayer Two: %s\n", playerTwo.print());

            System.out.println("\nP1: " + playerOne.isAlive());
            System.out.println("\nP2: " + playerTwo.isAlive());

            System.out.println("\nP1 Moedas ao início da rodada: " + playerOne.getCoins());
            System.out.println("P2 Moedas ao início da rodada: " + playerTwo.getCoins());

            // os dois cooperam
            if (playOne && playTwo) {
                playerOne.setCoins(playerOne.getCoins() + 2 - 1);
                playerTwo.setCoins(playerTwo.getCoins() + 2 - 1);

                System.out.println("\nOs dois cooperaram!\n");

    
            // playerOne coopera e playerTwo trapaceia
            } else if (playOne && !playTwo) {
                playerTwo.setCoins(playerTwo.getCoins() + 4);
                playerOne.setCoins(playerOne.getCoins() - 1);

                System.out.println("\nP2 trapaceou!\n");
    
            // playerOne traapceia e playerTwo coopera
            } else if (!playOne && playTwo) {
                playerOne.setCoins(playerOne.getCoins() + 4);
                playerTwo.setCoins(playerTwo.getCoins() - 1);

                System.out.println("\nP1 trapaceou!\n");
    
            } else {
                System.out.println("\nOs dois trapacearam!\n");
            }
            
            // impacto na personalidade dos jogadores
            playerOne.calc(playTwo);
            playerTwo.calc(playOne);
            
            taxes(playerOne, playerTwo);

            playerStatus(playerOne, rnd1);
            playerStatus(playerTwo, rnd2);

            
            System.out.println("\nP1 Moedas ao final da rodada: " + playerOne.getCoins());
            System.out.println("P2 Moedas ao final da rodada: " + playerTwo.getCoins());

            System.out.println("\nP1: " + playerOne.isAlive());
            System.out.println("\nP2: " + playerTwo.isAlive());

            System.out.println(currentSize);

            if (currentSize <= 30) {
                System.out.println(("\nTODO MUNDO MORREU!"));
                break;
            }
            
        }

    }
}
