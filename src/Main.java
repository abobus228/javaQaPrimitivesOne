public class Main {
    public static void main(String[] args) {
        int ticketPrice = 23_654;
        int oneMilePerRuble = 20;
        int countBonusMiles = ticketPrice / oneMilePerRuble;

        System.out.println(countBonusMiles);
    }
}