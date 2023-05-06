package telefonia.contas;

import telefonia.usuarios.Usuario;

/**
 *
 * @author Charlito
 */
public class ContaPos extends ContaTelefonica {
    private int minutosConsumidos;
    
    public ContaPos(Usuario usuario) {
        super(TipoConta.POS,usuario);
        this.minutosConsumidos = 0;
    }
    
    public int getMinutosConsumidos() {
        return minutosConsumidos;
    }
    
    @Override
    public String fazerLigacao(int minutos, int numeroDestino) {
        this.minutosConsumidos += minutos;
        return "Realizando ligação para o número: " + numeroDestino + "...\nLigação de" + minutos + " minutos realizada com sucesso!";        
    }

    @Override
    public String receberLigacaoCobrar(int minutos, int numeroDestino) {
        this.minutosConsumidos += minutos;
        return "Recebendo ligação a cobrar do número: " + numeroDestino + "...\nLigação a cobrar de " + minutos + " minutos recebida com sucesso!";
    }

    @Override
    public String realizarLigacaoCobrar(int minutos, int numeroDestino) {
        return "Realizando ligação a cobrar para o número: " + numeroDestino + "...\nLigação a cobrar de " + minutos + " minutos realizada com sucesso!";
    }

    public String mostrarInformacoes() {
        String info = "\n----------------------------------------\n";
        info += "Débito de minutos consumidos: " + minutosConsumidos + " minutos";
        info += "\n----------------------------------------\n";
        return info;   
    }
    
}
