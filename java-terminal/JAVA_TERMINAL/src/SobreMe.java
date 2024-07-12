import java.util.Locale;
import java.util.Scanner;

public class SobreMe {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Primeiro nome:");
        String primeiroNome = scanner.next();

        System.out.println("Digite Seu segundo Nome:");
        String segundoNome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura:");
        double altura = scanner.nextDouble();

        System.out.println("*******************");
        System.out.println("Olá, mechamo "+ primeiroNome + " "+ segundoNome);
        System.out.println("Tenho:"+ idade);
        System.out.println("medindo:"+ altura);
        
    }
}
