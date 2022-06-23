public class Main {


    public static void main(String[] args) {

        var estacion = "VERANO";

        switch(estacion) {
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println(estacion);


        }
    }
}