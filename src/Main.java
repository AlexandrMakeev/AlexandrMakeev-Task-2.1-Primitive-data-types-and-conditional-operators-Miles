public class Main {
    public static void main(String[] args) {
        double priceTicket = 2000; // price ticket
        int rublesPerMile = 20; // number of rubles per one bonus mile
        int numberOfBonuses = (int) priceTicket / rublesPerMile; //  number bonus miles
        System.out.println("Number of miles accrued for the purchased ticket: " + numberOfBonuses);
    }
}
