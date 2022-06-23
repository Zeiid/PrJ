public class Main {
    public static void main(String[] args) {


        int numeroWhile = 2;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }


        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);


    }
}