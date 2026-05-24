import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Enumeration;

public class ArvoreGenealogica {

    public static void main(String[] args) {
        // Raiz
        DefaultMutableTreeNode elizabeth = new DefaultMutableTreeNode("Rainha Elizabeth II");

        // Pais
        DefaultMutableTreeNode georgeVI = new DefaultMutableTreeNode("Pai: Rei George VI");
        DefaultMutableTreeNode elizabethBowes = new DefaultMutableTreeNode("Mãe: Elizabeth Bowes-Lyon");

        elizabeth.add(georgeVI);
        elizabeth.add(elizabethBowes);

        // Avós
        DefaultMutableTreeNode georgeV = new DefaultMutableTreeNode("Avô Paterno: Rei George V");
        DefaultMutableTreeNode maryTeck = new DefaultMutableTreeNode("Avó Paterna: Mary de Teck");

        DefaultMutableTreeNode claudeBowes = new DefaultMutableTreeNode("Avô Materno: Claude Bowes-Lyon");
        DefaultMutableTreeNode ceciliaCavendish = new DefaultMutableTreeNode("Avó Materna: Cecilia Cavendish-Bentinck");

        georgeVI.add(georgeV);
        georgeVI.add(maryTeck);

        elizabethBowes.add(claudeBowes);
        elizabethBowes.add(ceciliaCavendish);

        // Bisavós
        DefaultMutableTreeNode edwardVII = new DefaultMutableTreeNode("Bisavô Paterno: Rei Edward VII");
        DefaultMutableTreeNode alexandra = new DefaultMutableTreeNode("Bisavó Paterna: Alexandra da Dinamarca");

        DefaultMutableTreeNode francisTeck = new DefaultMutableTreeNode("Bisavô Materno: Francis de Teck");
        DefaultMutableTreeNode maryAdelaide = new DefaultMutableTreeNode("Bisavó Materna: Mary Adelaide");

        georgeV.add(edwardVII);
        georgeV.add(alexandra);

        maryTeck.add(francisTeck);
        maryTeck.add(maryAdelaide);

        // Outros bisavós
        DefaultMutableTreeNode francisBowes = new DefaultMutableTreeNode("Bisavô Paterno: Francis Bowes-Lyon");
        DefaultMutableTreeNode louisaScott = new DefaultMutableTreeNode("Bisavó Paterna: Louisa Scott");

        claudeBowes.add(francisBowes);
        claudeBowes.add(louisaScott);

        DefaultMutableTreeNode charlesCavendish = new DefaultMutableTreeNode("Bisavô Materno: Charles Cavendish-Bentinck");
        DefaultMutableTreeNode carolineBurnaby = new DefaultMutableTreeNode("Bisavó Materna: Caroline Burnaby");

        ceciliaCavendish.add(charlesCavendish);
        ceciliaCavendish.add(carolineBurnaby);

        // Trisavós
        DefaultMutableTreeNode albert = new DefaultMutableTreeNode("Trisavô Paterno: Príncipe Albert");
        DefaultMutableTreeNode victoria = new DefaultMutableTreeNode("Trisavó Paterna: Rainha Victoria");

        edwardVII.add(albert);
        edwardVII.add(victoria);

        DefaultMutableTreeNode christianIX = new DefaultMutableTreeNode("Trisavô Materno: Christian IX da Dinamarca");
        DefaultMutableTreeNode louiseHesse = new DefaultMutableTreeNode("Trisavó Materna: Louise de Hesse");

        alexandra.add(christianIX);
        alexandra.add(louiseHesse);

        System.out.println("=== Árvore Genealógica ===\n");
        imprimirArvore(elizabeth, 0);
    }

    public static void imprimirArvore(DefaultMutableTreeNode node, int nivel) {

        // Indentação
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        // Imprime o nome do nó
        System.out.println(node.getUserObject());

        // Percorre os filhos do nó
        Enumeration filhos = node.children();

        // Recursividade
        while(filhos.hasMoreElements()) {

            DefaultMutableTreeNode filho = (DefaultMutableTreeNode) filhos.nextElement();
            imprimirArvore(filho, nivel + 1);
        }
    }

}
