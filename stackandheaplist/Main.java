public class Main {
    
    public static void main (String []args) {

        //instancia as duas classes
        Queue <Integer> queue = new Queue<>();
        Stack <Integer> stack = new Stack<>(10);

        //adiciona novov valores na queue:
        for (int i = 0; i < 20; i += 2) {
            NodeQueue <Integer> newnode =  new NodeQueue<Integer>(i);
            queue.enqueue(newnode);
        }

        // printa os valores da fila
        System.out.println("=== VALORES ADICIONADOS À FILA: ===");
        queue.printQueue();

        // remove o primeiro valor da fila
        queue.dequeue();

        System.out.println("=== VALORES ATUALIZADOS DA FILA: ===");
        queue.printQueue();
        

    }
}
