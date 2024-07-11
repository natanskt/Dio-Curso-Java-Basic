public class SobreMe {
    public static void main(String[] args) {
        
        String primeiroNome = args[0];
        String segundoNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);


        System.out.println("Olá, mechamo "+ primeiroNome + " "+ segundoNome);
        System.out.println("Tenho:"+ idade);
        System.out.println("medindo:"+ altura);
        
    }
}
