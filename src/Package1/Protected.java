package Package1;

public class Protected {
    public static void main(String[] args) {
        Central central = new Central();
        /*
         * Pode ser acessado:
         * Própria Classe
         * Do próprio pacote
         * De um extends Central
         * 
         * Não pode ser acessado:
         * De qualquer lugar
         */
        System.out.println(central.protectedMessage);
    }
}
