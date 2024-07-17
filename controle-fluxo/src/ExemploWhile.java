import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0 ;
    
        while (mesada>0) {
            double valorDoce = valorAleatorio();
           

            if (valorDoce>mesada) {
                valorDoce = mesada;

            }
            System.out.println("Doce adicionado ao carrinho : R$: "+ valorDoce);
                mesada = mesada - valorDoce;


            }

            System.out.println("Mesada R$:"+ mesada);
            System.out.println("João gastou toda sua mesada");
    }
        
    

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1 , 10);

    }

    
}

