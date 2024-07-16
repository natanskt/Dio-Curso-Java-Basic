import java.util.Scanner;

public class PlanoOperadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String plano;

        System.out.println("***ECOLHA SEU PLANO");
        System.out.println("B - Basico");
        System.out.println("M - Intermedio");
        System.out.println("F - Full");

        plano = scanner.nextLine();

        switch (plano) {
            case "F":
            System.out.println("Youtube free + 50gb");
                
             case "M":
             System.out.println("100 GB INTERNET");  
             case "B":
             System.out.println("100 min ligação + apps ilimitados");
                break;
            default:
            System.out.println("Escolha uma da opções listadas");

                break;
        }


    }
    
}
