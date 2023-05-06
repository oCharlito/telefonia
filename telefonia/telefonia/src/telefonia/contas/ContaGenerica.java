
package telefonia.contas;

import telefonia.usuarios.Usuario;

/**
 *
 * @author Charlito
 */
public abstract class ContaGenerica extends ContaTelefonica {

    public ContaGenerica(TipoConta tipoPlano, Usuario usuario) {
        super(tipoPlano, usuario);
    }
    
    public abstract String recarregarCreditos(int quantidade);
}
