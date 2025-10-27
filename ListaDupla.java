public void removerNoInicio() {
        if (estaVazia()) {
            System.out.println("Erro: Não é possível remover de uma lista vazia.");
            return;
        }

        if (this.tamanho == 1) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = this.inicio.proximo;
            this.inicio.anterior = null;
        }
        this.tamanho--;
    }

    public void removerNoFinal() {
        if (estaVazia()) {
            System.out.println("Erro: Não é possível remover de uma lista vazia.");
            return;
        }

        if (this.tamanho == 1) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.fim = this.fim.anterior;
            this.fim.proximo = null;
        }
        this.tamanho--;
    }
    
    public void removerNaPosicao(int pos) {
        if (estaVazia() || pos < 0 || pos >= this.tamanho) {
            System.out.println("Erro: Posição de remoção inválida (" + pos + ").");
            return;
        }

        if (pos == 0) {
            removerNoInicio();
        } else if (pos == this.tamanho - 1) {
            removerNoFinal();
        } else {
            No noParaRemover = this.inicio;

            for (int i = 0; i < pos; i++) {
                noParaRemover = noParaRemover.proximo;
            }

            No anterior = noParaRemover.anterior;
            No proximo = noParaRemover.proximo;

            anterior.proximo = proximo;
            proximo.anterior = anterior;

            this.tamanho--;
        }
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista: [ Vazia ]");
            return;
        }

        No atual = this.inicio;
        System.out.print("Lista: [ ");
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(", ");
            }
            atual = atual.proximo;
        }
        System.out.println(" ]");
    }
}