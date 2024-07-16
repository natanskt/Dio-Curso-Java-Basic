public class CaixaEletronic {
    public static void main(String[] args) {
        double saldo = 26;
        double valorSolicitado= 17;

        if (valorSolicitado < saldo) {
            saldo = saldo -valorSolicitado;
            System.out.println("R$:"+saldo);
            
        }
    }
}
