package Package2;

import Package1.Central;

public class Default {
    public static void main(String[] args) {
        Central central = new Central();
        /*
         * Pode ser acessado:
         * Própria Classe
         * Do próprio pacote
         * 
         * Não pode ser acessado:
         * De um extends Central
         * De qualquer lugar
         */
        // System.out.println(central.defaultMessage);
        // Irá causar error por que ele só se extende até o próprio pacote
        // Incluindo todas suas classes!

        
        // OBS:     Mesmo se der um extends direto para a Central nao funciona
        // Como mostra abaixo

        // NewCentral newCentral = new NewCentral();
        // System.out.println(newCentral.defaultMessage);
    }
}
