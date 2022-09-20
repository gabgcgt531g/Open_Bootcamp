package paqprincipal;

public class Principal {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.SumaPuerta();

        System.out.println(micoche.puertas);
    }
    //Declaración de la función
    public static int suma(int a, int b) {
        return a + b;
    }
}
    class coche {
        public int puertas = 4;
        public void SumaPuerta() {
            this.puertas++;
        }
    }

