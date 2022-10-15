package Package1;

public class Central {
    /*
     * Definindo cada tipo através dos estudos do Public, Default, Protected e Private!
     */
    public String publicMessage = "This is public";
    String defaultMessage = "this is default";
    protected String protectedMessage = "This is protected";
    private String privateMessage = "This is private";

    public static void main(String[] args) {
        Central central = new Central();
        /*
         * Definições de onde até eles vão:
         *      private    ->  Própria Classe
         *      default    ->  Do próprio pacote
         *      protected  ->  De um extends Central
         *      public     ->  De qualquer lugar
         * É importante definir os packages dentro dos próprios arqivos para serem definidos!
         */
        System.out.println(central.privateMessage);
    }
}