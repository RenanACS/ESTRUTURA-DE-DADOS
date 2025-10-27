public class TestarListaDupla {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        System.out.println("--- Teste Inicial ---");
        System.out.println("Tamanho: " + lista.tamanho());
        lista.exibir(); 

        System.out.println("\n--- Teste inserirNoInicio ---");
        lista.inserirNoInicio(10);
        lista.exibir(); 
        lista.inserirNoInicio(5);
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 

        System.out.println("\n--- Teste inserirNoFinal ---");
        lista.inserirNoFinal(20);
        lista.exibir(); 
        lista.inserirNoFinal(30);
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 

        System.out.println("\n--- Teste inserirNaPosicao ---");
        lista.inserirNaPosicao(0, 1);  
        lista.exibir(); 
        lista.inserirNaPosicao(5, 40); 
        lista.exibir(); 
        lista.inserirNaPosicao(3, 15); 
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 
        lista.inserirNaPosicao(10, 99); 

        System.out.println("\n--- Teste removerNoInicio ---");
        lista.removerNoInicio();
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 

        System.out.println("\n--- Teste removerNoFinal ---");
        lista.removerNoFinal();
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 

        System.out.println("\n--- Teste removerNaPosicao ---");
        lista.removerNaPosicao(0); 
        lista.exibir(); 
        lista.removerNaPosicao(3); 
        lista.exibir(); 
        lista.removerNaPosicao(1); 
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 
        lista.removerNaPosicao(5); 

        System.out.println("\n--- Teste de Esvaziamento ---");
        lista.removerNoFinal();
        lista.removerNoInicio();
        lista.exibir(); 
        System.out.println("Tamanho: " + lista.tamanho()); 
        lista.removerNoInicio(); 
        lista.removerNoFinal(); 
    }
}