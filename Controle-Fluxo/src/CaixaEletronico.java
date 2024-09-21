public class CaixaEletronico {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if(valorSolicitado < saldo){
            saldo = saldo-valorSolicitado;
        
            System.out.println("Novo Saldo R$" + saldo);

        }else{
            System.out.println("Você não tem saldo suficiente");
        }
           
        
        }


}
