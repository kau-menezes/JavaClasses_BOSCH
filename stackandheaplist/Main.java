public class Main {
    
    public static void main (String []args) {

        //instancia as duas classes
        Queue <Integer> queue = new Queue<>();
        Stack <Integer> stack = new Stack<>(5);

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

        System.out.println("\n=== VALORES ATUALIZADOS DA FILA: ===");
        queue.printQueue();

        // adiciona valores na lista
        for (int i = 0; i < 8; i += 2) {
            stack.push(i);
        }

        // printa os valores da lista
        System.out.println("=== VALORES ADICIONADOS À LISTA: ===");
        System.out.println("\nTAMANHO: " + stack.getSize());
        System.out.println("\nCAPACIDADE TOTAL: " + stack.findLenght());
        stack.printStack();

        // remove o último da lsta
        stack.pop();

        // printa os valores da lista
        System.out.println("=== VALORES ATUALIZADOS DA LISTA: ===");
        System.out.println("\nTAMANHO: " + stack.getSize());
        System.out.println("\nCAPACIDADE TOTAL: " + stack.findLenght());
        stack.printStack();

        // adiciona novos valores na lista
        for (int i = 0; i < 10; i += 2) {
            stack.push(i);
        }
        
        // printa os valores da lista
        System.out.println("=== VALORES ATUALIZADOS DA LISTA: ===");
        System.out.println("\nTAMANHO: " + stack.getSize());
        System.out.println("\nCAPACIDADE TOTAL: " + stack.findLenght());
        stack.printStack();

    }
}
