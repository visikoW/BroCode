package Package1;

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
        System.out.println(central.defaultMessage);
    }
}
