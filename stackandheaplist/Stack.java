public class Stack<T>{
    
    private int size = 0;
    private T[] list;
    private int originalSize = 0;
    
    // construtor
    Stack(int listOriginalSize) {
        this.originalSize = listOriginalSize;
        list = (T[])(new Object[listOriginalSize]);
        
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
        
        list[size - 1] = value;
        
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }

    public int findLast() {
        int i = 0;
        while (list[i] != null) {
            i++;
        }

        return i;
    }

    public int findLenght () {
        return list.length;
    }
    
    public T pop() {
        T returnValue = list[size - 1];
        list[size - 1] = null;
        size--;
        
        return returnValue;
        
    }
    
    public T peek() {
        
        return list[size - 1];
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public T[] getList() {
        return list;
    }
    
    public void setList(T[] list) {
        this.list = list;
    }

}
