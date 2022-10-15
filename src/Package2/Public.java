package Package2;

import Package1.Central;

public class Public {
    public static void main(String[] args) {
        Central central = new Central();
        /*
         * Pode ser acessado:
         * Própria Classe
         * Do próprio pacote
         * De um extends Central
         * De qualquer lugar
         * 
         * Não pode ser acessado:
         */
        System.out.println(central.publicMessage);
        // Idependente de onde estiver, ele pode ser chamado!
    }
}
