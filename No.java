import java.util.NoSuchElementException;

class No {
    int valor;
    No anterior;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDupla {
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
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
        if (estaVazia()) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.anterior = this.fim;
            this.fim.proximo = novoNo;
            this.fim = novoNo;
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
        } else if (pos == this.tamanho) {
            inserirNoFinal(valor);
        } else {
            No novoNo = new No(valor);
            No atual = this.inicio;
            
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            
            No anterior = atual.anterior;

            novoNo.proximo = atual;
            novoNo.anterior = anterior;
            
            anterior.proximo = novoNo;
            atual.anterior = novoNo;
            
            this.tamanho++;
        }
    }