//Definición de una clase
public class Main {
    Class Potato {
        public int brazos = 0;

        public void QuitarBrazo(){
            this.brazos--;
        }
    }
    public static void main(String[ ] args) {
        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
    }

    //Declaración de la función
    public static int suma (int a, int b) {

        return a+b;
    }

}
