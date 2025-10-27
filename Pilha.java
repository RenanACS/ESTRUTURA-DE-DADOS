import java.util.EmptyStackException;

public class Pilha {

    private int[] array;
    private int topo; 
    private int capacidade;


    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
      
        this.topo = -1;
    }

   
    public boolean isFull() {
        return topo == capacidade - 1;
    }

    
    public boolean isEmpty() {
        return topo == -1;
    }

    
    public void push(int valor) {
        if (isFull()) {
           
            throw new RuntimeException("Erro: Pilha cheia!");
        }
      
        topo++;
        array[topo] = valor;
    }

  
    public int pop() {
        if (isEmpty()) {
           
            throw new EmptyStackException();
        }
       
        int valorTopo = array[topo];
        topo--;
        return valorTopo;
    }

    
    public int peek() {
        if (isEmpty()) {
         
            throw new EmptyStackException();
        }
       
        return array[topo];
    }

   
    public static void main(String[] args) {
      
        Pilha minhaPilha = new Pilha(5);

        System.out.println("Pilha está vazia? " + minhaPilha.isEmpty()); 

       
        System.out.println("\nInserindo 10, 20, 30...");
        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);

        
        System.out.println("Elemento do topo (peek): " + minhaPilha.peek());

        System.out.println("Pilha está vazia? " + minhaPilha.isEmpty()); 

       
        System.out.println("\nRemovendo elementos (pop):");
        while (!minhaPilha.isEmpty()) {
            System.out.println("Removido: " + minhaPilha.pop());
        }
        
       

        System.out.println("Pilha está vazia? " + minhaPilha.isEmpty()); 
    }
}