
public class ListaSimples {
    private No inicio;
    private int tamanho;

   
    public ListaSimples() {
        this.inicio = null;
        this.tamanho = 0;
    }

    
    public int tamanho() {
        return this.tamanho;
    }

   
    public boolean estaVazia() {
        return this.tamanho == 0; 
    }

  
    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = this.inicio;
        this.inicio = novoNo;
        this.tamanho++;
    }

   
    public void inserirNoFinal(int valor) {
        No novoNo = new No(valor);
        
       
        if (estaVazia()) {
            this.inicio = novoNo;
        } else {
           
            No aux = this.inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
           
            aux.proximo = novoNo;
        }
        this.tamanho++;
    }

   
    public void inserirNaPosicao(int pos, int valor) {
        
        if (pos < 0 || pos > this.tamanho) {
            System.out.println("Erro: Posição de inserção inválida (" + pos + ").");
            return;
        }

        
        if (pos == 0) {
            inserirNoInicio(valor);
        } 
       
        else if (pos == this.tamanho) {
            inserirNoFinal(valor);
        } 
       
        else {
            No novoNo = new No(valor);
            No aux = this.inicio;
            
          
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.proximo;
            }
            
           
            novoNo.proximo = aux.proximo;
            aux.proximo = novoNo;
            this.tamanho++;
        }
    }

   
    public void removerNoInicio() {
        if (estaVazia()) {
            System.out.println("Erro: Não é possível remover de uma lista vazia.");
            return;
        }

      
        this.inicio = this.inicio.proximo;
        this.tamanho--;
    }

    
    public void removerNoFinal() {
        if (estaVazia()) {
            System.out.println("Erro: Não é possível remover de uma lista vazia.");
            return;
        }

       
        if (this.tamanho == 1) { 
            this.inicio = null;
        } 
      
        else {
            No aux = this.inicio;
            No anterior = null;
            
           
            while (aux.proximo != null) {
                anterior = aux;
                aux = aux.proximo;
            }
            
            
            anterior.proximo = null;
        }
        this.tamanho--;
    }

  
    public void removerNaPosicao(int pos) {
      
        if (pos < 0 || pos >= this.tamanho) {
            System.out.println("Erro: Posição de remoção inválida (" + pos + ").");
            return;
        }
        
        if (estaVazia()) {
             System.out.println("Erro: Não é possível remover de uma lista vazia.");
            return;
        }

        
        if (pos == 0) {
            removerNoInicio();
        } 
        
        else {
            No aux = this.inicio;
            No anterior = null;
            
            
            for (int i = 0; i < pos; i++) {
                anterior = aux;
                aux = aux.proximo;
            }
            
           
            anterior.proximo = aux.proximo;
            this.tamanho--;
        }
    }

    
    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista Vazia.");
            return;
        }

        No aux = this.inicio;
        System.out.print("Lista [Tamanho: " + this.tamanho + "]: ");
        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.proximo;
        }
        System.out.println("null");
    }
}