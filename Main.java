
public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        System.out.println("--- Testando Lista Simples ---");

       
        System.out.println("Tamanho inicial: " + lista.tamanho());
        lista.exibir();
        System.out.println("---------------------------------");

       
        System.out.println("Inserindo 10 no início...");
        lista.inserirNoInicio(10);
        lista.exibir();
        
        System.out.println("Inserindo 5 no início...");
        lista.inserirNoInicio(5);
        lista.exibir();
        System.out.println("---------------------------------");

        
        System.out.println("Inserindo 20 no final...");
        lista.inserirNoFinal(20);
        lista.exibir();
        
        System.out.println("Inserindo 25 no final...");
        lista.inserirNoFinal(25);
        lista.exibir();
        System.out.println("---------------------------------");

        
        System.out.println("Inserindo 15 na posição 2...");
        lista.inserirNaPosicao(2, 15); 
        lista.exibir();
        
        System.out.println("Inserindo 2 na posição 0 (início)...");
        lista.inserirNaPosicao(0, 2);
        lista.exibir();
        
        System.out.println("Inserindo 30 na posição 6 (final)...");
        lista.inserirNaPosicao(6, 30); 
        lista.exibir();
        System.out.println("---------------------------------");

        
        System.out.println("Tamanho atual: " + lista.tamanho());
        System.out.println("---------------------------------");

       
        System.out.println("Removendo do início...");
        lista.removerNoInicio();
        lista.exibir();
        System.out.println("---------------------------------");

       
        System.out.println("Removendo do final...");
        lista.removerNoFinal();
        lista.exibir();
        System.out.println("---------------------------------");

        
        System.out.println("Removendo da posição 2 (valor 15)...");
        lista.removerNaPosicao(2);
        lista.exibir();
        
        System.out.println("Removendo da posição 0 (valor 5)...");
        lista.removerNaPosicao(0);
        lista.exibir();

        
        System.out.println("Removendo da posição 2 (valor 25, final)...");
        lista.removerNaPosicao(2);
        lista.exibir();
        
        System.out.println("Tamanho final: " + lista.tamanho());
        System.out.println("---------------------------------");
        
        
        System.out.println("Removendo do final (lista com 2 elementos)...");
        lista.removerNoFinal();
        lista.exibir(); 
        System.out.println("Removendo do início (lista com 1 elemento)...");
        lista.removerNoInicio();
        lista.exibir(); 
        System.out.println("Tamanho final: " + lista.tamanho());
    }
}