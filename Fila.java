import java.util.NoSuchElementException;

public class Fila {

    private int[] array;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            throw new RuntimeException("Erro: Fila cheia!");
        }
        
        fim = (fim + 1) % capacidade; 
        array[fim] = valor;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Erro: Fila vazia!");
        }

        int valorInicio = array[inicio];
        
        inicio = (inicio + 1) % capacidade; 
        tamanho--;
        return valorInicio;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Erro: Fila vazia!");
        }
        return array[inicio];
    }

    public static void main(String[] args) {
        Fila minhaFila = new Fila(5);

        System.out.println("Fila está vazia? " + minhaFila.isEmpty());

        System.out.println("\nInserindo 10, 20, 30...");
        minhaFila.enqueue(10);
        minhaFila.enqueue(20);
        minhaFila.enqueue(30);

        System.out.println("Primeiro elemento (peek): " + minhaFila.peek());

        System.out.println("Fila está vazia? " + minhaFila.isEmpty());

        System.out.println("\nRemovendo elementos (dequeue):");
        while (!minhaFila.isEmpty()) {
            System.out.println("Removido: " + minhaFila.dequeue());
        }
        
        System.out.println("Fila está vazia? " + minhaFila.isEmpty());
    }
}