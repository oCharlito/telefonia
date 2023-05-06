package telefonia.usuarios;

/**
 *
 * @author Charlito
 */

public class Usuario {
    private String nome;
    private char sexo;

    public Usuario(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

       public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}

