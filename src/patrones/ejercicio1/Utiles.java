package patrones.ejercicio1;


public class Utiles {
    public static int tryParse(String z) {
        try {
            return Integer.valueOf(z);
        }
        catch (Exception ex) {
            return 0;
        }
    }
}
