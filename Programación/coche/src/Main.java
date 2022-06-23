public class Main {
    public static void main(String[] args) {
        Coche elCoche = new Coche();
        elCoche.npuertas();
        System.out.println(elCoche.puertas);
    }


    static class Coche {
        public int puertas =0;

        public void npuertas() {
            this.puertas++;
        }
    }
}