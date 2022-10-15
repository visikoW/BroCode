package Package2;

import Package1.Central;

public class Protected extends Central{
    public static void main(String[] args) {
        Protected p = new Protected();
        /*
         * Pode ser acessado:
         * Própria Classe
         * Do próprio pacote
         * De um extends Central
         * 
         * Não pode ser acessado:
         * De qualquer lugar
         */
        System.out.println(p.protectedMessage);
        /* É importante salientar que o protected só é ativo por que ele se tornou uma sub class
         * Isso limitou a área de atuação do class, por não trato diretamento com a classe central
         * Mas sim com o próprio Protected (classe criada dentro do Package2)!
        */
    }
}
