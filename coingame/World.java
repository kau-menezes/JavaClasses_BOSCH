package coingame;

import java.util.Random;

public class World {
    public int totalCheaters;
    public int totalCooperators;
    public int totalGrumpys;
    public int totalCopycats;
    public int totalTolerants;

    private int currentSize = 0;

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
    
    // retorna um valor dependente da quantidade de moedas
    public void playerStatus(Individual player) {
        if (player.coins <= 0) {
            player.alive = false;
            System.out.println("\nUm Player morreu :(");

        } else if (player.coins >= 20) {
            Individual clone = player.copy();
            push(clone);
            System.out.println("\nUm Player foi clonado :)");

        } 

    }

    // o jogo em si
    public void round(Individual[] array) {

        // realiza 250 interações 
        for (int i = 0; i < 250; i++) {

            System.out.println("\n=== RODADA: " + i);

            //instancia um objeto da classe Random
            Random random = new Random();
    
            // guarda números aleatórios em duas variáveis diferentes
            int rnd1,rnd2;
            
            // impede a geração de dois números iguais
                do
                {
                    rnd1 = random.nextInt(currentSize);
                    rnd2 = random.nextInt(currentSize);

                } while (rnd1 == rnd2);
    
            // define duas variáveis que guardarão os jogadores
            Individual playerOne = array[rnd1];
            Individual playerTwo = array[rnd2];
    
            // play!
            boolean playOne = playerOne.play();
            boolean playTwo = playerTwo.play();

            // voltar com o método abtrato de print();
            System.out.printf("\nPlayer One: %s", playerOne.print());
            System.out.printf("\nPlayer Two: %s\n", playerTwo.print());

    
            // os dois cooperam
            if (playOne && playTwo) {
                playerOne.coins++;
                playerTwo.coins++;
                System.out.println("\nOs dois coperaram!");

    
            // playerOne coopera e playerTwo trapaceia
            } else if (playOne && !playTwo) {
                playerTwo.coins += 4;
                System.out.println("\nP2 trapaceou!");
    
            // playerOne traapceia e playerTwo coopera
            } else if (!playOne && playTwo) {
                playerOne.coins += 4;
                System.out.println("\nP1 trapaceou!");
    
            } else {
                System.out.println("\nOs dois trapacearam!");
            }
    
            // impacto na personalidade dos jogadores
            playerOne.calc(playTwo);
            playerTwo.calc(playOne);
    
            playerStatus(playerOne);
            playerStatus(playerTwo);

            System.out.println("\n===");

        }

    }
}
