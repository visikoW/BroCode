package Package1;

public class Private {
    public static void main(String[] args) {
        Central central = new Central();
        // !!!!!!!!! System.out.println(central.privateMessage); !!!!!!!!!
        // 
        // Irá causar um error, pois o private só é acessado através da própria classe
        // 
    }
}
