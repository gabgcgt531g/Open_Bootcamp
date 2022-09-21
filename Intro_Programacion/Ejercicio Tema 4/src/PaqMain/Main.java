package PaqMain;

public class Main {
    public static void main (String[] args) {

        // Bucle if else
        int numeroIf = -1;
        if (numeroIf > 0){
            System.out.println("Número positivo");
        } else if (numeroIf < 0){
            System.out.println("Número negativo");
        } else {
            System.out.println("Número cero");
        }

       //Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Bucle Do while
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile -1;
        } while (numeroWhile < 1);

        //Bucle for
        for (int numeroFor = 0; numeroFor <=3; numeroFor++)
            System.out.println(numeroFor);

        //Bucle Switch case
        var estacion = "Otoño";

        switch (estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}
