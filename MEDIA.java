public class MEDIA {
    public static void main(String[] args) {
      
        double[] notas = {7.5, 8.0, 6.5, 9.0};

      
        double soma = 0;

       
        for (double nota : notas) {
            soma += nota;
        }

      
        double media = soma / notas.length;

        
        System.out.println("Média das notas: " + media);
    }
}