package telefonia.contas;

import telefonia.usuarios.Usuario;

/**
 *
 * @author Charlito
 */
public class ContaPre extends ContaGenerica {
    private int creditosMinutos;

    public ContaPre(Usuario usuario) {
        super(TipoConta.PRE, usuario);
        this.creditosMinutos = creditosMinutos;
    }

    public int getCreditosMinutos() {
        return creditosMinutos;
    }

    @Override
    public String fazerLigacao(int minutos, int numeroDestino) {
      if (creditosMinutos >= minutos) {
          creditosMinutos -= minutos;
         return "Realizando ligação para o número " + numeroDestino + "...\nLigação de " + minutos + " minutos realizada com sucesso!\nSaldo restante: " + creditosMinutos + " minutos.";  
        } 
        return "Não há créditos suficientes para realizar a ligação, faça uma recarga.";       
        }

    @Override
    public String receberLigacaoCobrar(int minutos, int numeroDestino) {
         if (creditosMinutos >= minutos) {    
             creditosMinutos -= minutos;
            return "Recebendo ligação a cobrar do número: " + numeroDestino + "...\nLigação a cobrar de " + minutos + " minutos recebida com sucesso!\nSaldo restante: " + creditosMinutos + " minutos.";   
        }    
         return "Créditos insuficientes para receber a ligação de: " + minutos + " minutos";       
    }  

    @Override
    public String realizarLigacaoCobrar(int minutos, int numeroDestino) {
        return "Realizando ligação a cobrar para o número: " + numeroDestino + "...\nLigação de " + minutos + " minutos cobrar realizada com sucesso!";
    }

    @Override
    public String recarregarCreditos(int quantidade) {
        creditosMinutos += quantidade;
        return "Créditos recarregados com sucesso. Seu novo saldo é de: " + creditosMinutos + " minutos";
    }
    
    public String mostrarInformacoes() {
        String info = "\n----------------------------------------\n";
        info += "O seu saldo é de: " + creditosMinutos + " minutos";
        info += "\n----------------------------------------\n";
        return info;   
    }
}

