public class Operadores {
    public static void main(String[] args) {
        String nomme = "Natanael Martins";
        String sNome = "Junior";
        String nomeCompleto = nomme + " " + sNome ;
        System.out.println(nomeCompleto);

        int idade = - 30;
        System.out.println(idade);
        idade = -idade;
        System.out.println(idade);

     /* operadores ternários subistituindo o if / else */
     
     int a = 5;
     int b = 2;
    String resultado = ""; 
     if (a==b){
        resultado = "verdadeiro";
     }
     else
        resultado = "falso";

     System.out.println(resultado);

     resultado = a==b? "verdadeiro" : "falso";

     System.out.println(resultado);

     

   
    }

    

}
