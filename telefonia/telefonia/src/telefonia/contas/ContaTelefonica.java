package telefonia.contas;

import telefonia.usuarios.Usuario;

/**
 *
 * @author Charlito
 */
public abstract class ContaTelefonica {
    protected TipoConta tipoPlano;
    protected String numeroChip;
    protected Usuario usuario;
    protected static int qtdeDeContasCriadas = 0;
    
    public ContaTelefonica(TipoConta tipoPlano, Usuario usuario) {
        this.tipoPlano = tipoPlano;
        this.numeroChip = "1";
        this.usuario = usuario;
        qtdeDeContasCriadas += 1;
        this.numeroChip = String.valueOf(qtdeDeContasCriadas);
    }

    public TipoConta getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(TipoConta tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
   
    public String getNumeroChip() {
        return numeroChip;
    }
      
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public static int getQtdeDeContasCriadas() {
        return qtdeDeContasCriadas;
    }
    
    public abstract String fazerLigacao(int minutos, int numeroDestino);
    
    public abstract String receberLigacaoCobrar(int minutos, int numeroDestino);
    
    public abstract String realizarLigacaoCobrar(int minutos, int numeroDestino);
    
    
    
    @Override
    public String toString(){
        String info = "INFORMAÇÕES DO PLANO \n";
        info += "Tipo do plano: " + this.tipoPlano + "\n";
        info += "Número do chip: " + this.numeroChip + "\n";
        info += "Nome do cliente: " + this.usuario.getNome() + "\n";
        info += "Sexo: " + this.usuario.getSexo()+ "\n";
        info += "\n----------------------------------------\n";
        return info;      
    }

}
