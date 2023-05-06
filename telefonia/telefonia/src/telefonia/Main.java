package telefonia;

import telefonia.contas.ContaPre;
import telefonia.contas.ContaPos;
import telefonia.contas.ContaControle;
import telefonia.contas.ContaTelefonica;
import telefonia.usuarios.Usuario;

/**
 *
 * @author Charlito
 */
public class Main {
    public static void main(String[] args) {
        
      Usuario c1 = new Usuario("Gabriel Barbosa", 'M');
      Usuario c2 = new Usuario("Giorgian De Arrascaeta", 'M');
      Usuario c3 = new Usuario("Bruno Henrique", 'M');

      
      
      ContaPos pos = new ContaPos(c1);
      System.out.println("\nPÓS PAGO\n----------------------------------------\n");
      System.out.println(pos.toString());
      System.out.println(pos.fazerLigacao(10, 2));
      System.out.println(pos.receberLigacaoCobrar(33, 3));
      System.out.println(pos.realizarLigacaoCobrar(10, 2));
      System.out.println(pos.mostrarInformacoes());
      System.out.println("\n----------------------------------------\n");
      
      ContaPre pre = new ContaPre(c3);
      System.out.println("\nPRÉ PAGO\n----------------------------------------\n");
      System.out.println(pre.toString());
      System.out.println(pre.recarregarCreditos(18));
      System.out.println(pre.fazerLigacao(7, 2));
      System.out.println(pre.receberLigacaoCobrar(13, 1));
      System.out.println(pre.realizarLigacaoCobrar(60, 1));
      System.out.println(pre.mostrarInformacoes());
      System.out.println("\n----------------------------------------\n");
      
      ContaControle controle = new ContaControle(c2, 30);
      System.out.println("\nCONTROLE\n----------------------------------------\n");
      System.out.println(controle.toString());
      System.out.println(controle.fazerLigacao(20, 3));
      System.out.println(controle.receberLigacaoCobrar(13, 1));
      System.out.println(controle.recarregarCreditos(30));
      System.out.println(controle.realizarLigacaoCobrar(60, 1));
      System.out.println(controle.mostrarInformacoes());
      System.out.println("\n----------------------------------------\n");
                               
      System.out.println("\n----------------------------------------\n");
      System.out.println("Quantidade de contas abertas: " + ContaTelefonica.getQtdeDeContasCriadas() );
      System.out.println("\n----------------------------------------\n");

    }
    
}
