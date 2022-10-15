package Package2;

import Package1.Central;

public class Private {
    public static void main(String[] args) {
        Central central = new Central();
        // Nem adianta, que private só é acessado direto da classe mãe!
    }
}
