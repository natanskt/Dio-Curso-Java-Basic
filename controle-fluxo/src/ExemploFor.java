public class ExemploFor {
    public static void main(String[] args) {

      /* for (int carneiros = 0 ; carneiros <20 ; carneiros ++  ){
            System.out.println("Numero de carneiros"+ carneiros);
        }   */

        String alunos [] = {"Maria", "Natanael", "Marcos", "Paula"};

      /*  for(int x = 0 ; x < alunos.length ; x++){
            System.out.println("Aluno N°:" + x + " " + alunos[x]);
        }    */

        for (String aluno : alunos) {
            System.out.println("Nome do aluno : "+aluno);
            
        }



    }
}
