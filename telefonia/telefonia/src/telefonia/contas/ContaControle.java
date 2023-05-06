package telefonia.contas;

import telefonia.usuarios.Usuario;

/**
 *
 * @author Charlito
 */

public class ContaControle extends ContaGenerica {
    private int franquiaMinutos;

    public ContaControle(Usuario usuario, int franquiaMinutos) {
        super(TipoConta.CONTROLE, usuario);
        this.franquiaMinutos = franquiaMinutos;
    }
    
      public int getFranquiaMinutos() {
        return franquiaMinutos;
    }

    @Override
    public String fazerLigacao(int minutos, int numeroDestino) {
        System.out.println("FranquiaMinutos = " + franquiaMinutos);
        if (franquiaMinutos >= minutos) {
          franquiaMinutos -= minutos;
         return "Realizando ligação para o número " + numeroDestino + "...\nLigação de " + minutos + " minutos realizada com sucesso!\nSaldo restante: " + franquiaMinutos + " minutos.";  
        } 
        return "Não há créditos suficientes para realizar a ligação, faça uma recarga.";       
        }

   @Override
    public String receberLigacaoCobrar(int minutos, int numeroDestino) {
         if (franquiaMinutos >= minutos) {
             franquiaMinutos -= minutos;
            return "Recebendo ligação a cobrar do número: " + numeroDestino + "...\nLigação a cobrar de " + minutos + " minutos recebida com sucesso!\nSaldo restante: " + franquiaMinutos + " minutos.";  
        }
         return "Créditos insuficientes para receber a ligação de: " + minutos + " minutos";       
    }  

   @Override
    public String realizarLigacaoCobrar(int minutos, int numeroDestino) {
        return "Realizando ligação a cobrar para o número: " + numeroDestino + "...\nLigação a cobrar de " + minutos + " minutos realizada com sucesso!";        
    }

    @Override
     public String recarregarCreditos(int quantidade) {
        franquiaMinutos += quantidade;
        return"Créditos recarregados com sucesso. Seu novo saldo é de: " + franquiaMinutos + " minutos";
    }
    
    public String mostrarInformacoes() {
        String info = "\n----------------------------------------\n";
        info += "O seu saldo é de: " + franquiaMinutos + " minutos";
        info += "\n----------------------------------------\n";
        return info;   
    }

}

