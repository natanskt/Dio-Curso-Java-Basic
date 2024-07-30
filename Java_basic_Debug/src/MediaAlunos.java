import java.util.Scanner;

public class MediaAlunos {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        

 
        String[] alunos = {"Natanael","Marta", "Helena"};
        int media =  CalculaMediaAluno (alunos, scan);
        

        System.out.println("media Turma:" + media );

      
    }

    public static int CalculaMediaAluno (String[] alunos, Scanner scan){
        int soma = 0;

            for (String aluno : alunos) {
                System.out.println("Aluno nota : " + aluno );
                int nota = scan.nextInt();
                soma += nota;
                
            }
            return soma / alunos.length;

    }
}
