public class Stack<T>{
    
    private int size = 0;
    private T[] list;
    private int originalSize = 0;
    
    // construtor
    Stack(int listOriginalSize) {
        this.originalSize = listOriginalSize;
        list = (T[])(new Object[10]);

    }

    public void push(T value) {

        size++;
        if (size == originalSize) {
            T[] copy = (T[])(new Object[originalSize * 2]);

            for (int i = 0; i < list.length; i++) {
                copy[i] =  list[i];
            }

            list = copy;
        }

        list[size] = value;

    }

    public T pop() {
        
        T returnValue = list[size - 1];
        list[size - 1] = null;

        return returnValue;
        
    }

    public T peek() {

        return list[size - 1];
    }

}
