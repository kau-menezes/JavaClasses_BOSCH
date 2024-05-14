package hashbinarytree;

public class Main {

    public static void analyse(Graph graph, Hash hash, Queue queue) {

        // inicia pelo 0
        int index = 0;

        //pega o index e adiciona na fila
        queue.addNode(index);

        while (queue.quantity != 0) {

            // faz a verificação
            switch (hash.verify(index)) {
                case -1:
                case 1:
                    System.out.println("\nNão há conexão ainda! :(");
                    break;
                
                case 0:
                    System.out.println("\nÉ! :)");
                    break;
    
                default:
                    break;
            };
    
            //adiciona o pai na Hash
            hash.addHash(index);
    
            // adiciona os filhos na queue
            for (int i = 0; i < graph.getHeritage(index).length; i++) {
                queue.addNode(graph.getHeritage(index)[i]);
            }
    
            // tira o pai da fila
            queue.popNode();
    
            // fila anda bb
            index = queue.head.getValue();
        }
        
    }

    public static void main (String[] args) {

    // instancia as listas
    Hash hash = new Hash();
    Queue queue = new Queue();
    Graph graph = new Graph();


    }
}