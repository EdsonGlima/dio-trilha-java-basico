import java.util.Scanner;
public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila","Lucas","Bruna","Pedro"};

        double media = calculadoraDaTurma(alunos,scan);

        System.out.printf("Média do aluno %.1f",media);

    }
    public static double calculadoraDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for (String aluno:alunos){
            System.out.printf("Nota do Aluno %s: ",aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
