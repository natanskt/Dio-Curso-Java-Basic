public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

     /*    if (nota == 7) {
            System.out.println("Você foi reprovado");
            
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Você está em recuperação");
            
        }
        
        else System.out.println("Prabéns você foi aprovado");
*/

// Subistituindo todo código acima por condicional ternaria

        String resultado = nota >=7  ? "APROVADO" : nota >= 5 && nota <7 ? "Você está em recuperação" : "reprovado";
        System.out.println(resultado);
    }
}
