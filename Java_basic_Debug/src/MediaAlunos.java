import java.util.Scanner;

public class MediaAlunos {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        

 
        String[] alunos = {"Natanael","Marta", "Helena"};
        double media =  CalculaMediaAluno (alunos, scan);
        

        System.out.println("media Turma:" + media );

      
    }

    public static double CalculaMediaAluno (String[] alunos, Scanner scan){
        double soma = 0;

            for (String aluno : alunos) {
                System.out.println("Aluno nota : " + aluno );
                double nota = scan.nextDouble();
                soma += nota;
                
            }
            return soma / alunos.length;

    }
}
