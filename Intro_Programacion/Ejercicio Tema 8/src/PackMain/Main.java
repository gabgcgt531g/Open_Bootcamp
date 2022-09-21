package PackMain;

public class Main {
    public static void main (String[] args){
        //Recorre el array con un for
        int numeros[] = {10, 20, 30, 40, 50};

        //for (int i = 0; i < numeros.length; i++) {
        for (int i : numeros) { // forma simplificada
            System.out.println(numeros[i]);
        }
    }
}
