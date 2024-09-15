import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("-----BANCO LINUX SA-----");
        System.out.println("------------------------");
        System.out.println("Seja Bem Vindo, vamos abrir sua conta!");
        System.out.println("Deseja Abrir uma Conta? S/N :");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Informe Seu Nome Completo: ");
            String NomeCliente = scanner.nextLine();
            String Agencia = "2886-9";
            int Numero = 4589361;
            double saldo = 200.00;
            System.out.println("------------------------");
            System.out.println("-----BANCO LINUX SA-----");
            System.out.println("------------------------");
            System.out.println("Conta criada para: " + NomeCliente);
            System.out.println("AGÊNCIA :" + Agencia);
            System.out.println("NÚMERO DA CONTA :" + Numero);
            System.out.println("SALDO INICIAL :" + saldo);
            System.out.println("Obrigado por nos visitar!");
        }else{
            System.out.println("-----BANCO LINUX SA-----");
            System.out.println("Obrigado por nos visitar!");
            System.out.println("------------------------");
        }
       
    }
    


}
