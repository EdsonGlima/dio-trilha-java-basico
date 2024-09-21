import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada>0) {
            Double valorDoce = ValorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
                System.out.println("DOCE DO VALOR: " + valorDoce + " ADICIONANDO NO CARRINHO");
                mesada = mesada - valorDoce;
            
        }
        System.out.println("MESADA: " + mesada);
        System.out.println("JOAOZINHO GASTOU TODA SUA MESADA EM DOCES");
    }
    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
