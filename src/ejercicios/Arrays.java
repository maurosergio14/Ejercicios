package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
class Main {

    public static void main(String[] args) {
        /*
        * Creamos un ArrayList, recordemos que un ArrayList puede ser de cualquier  tipo;
        * para no complicar las cosas haremos un  ArrayList de tipo String
         */
        ArrayList<String> canciones = new ArrayList<>();

// Le agregamos datos
        canciones.add("Canciones 1");
        canciones.add("Canciones 2");
        canciones.add("Canciones 3");

// Método 1
        System.out.println("Recorriendo con método 1");
        for (String cancion : canciones) {
            System.out.println(cancion);
        }

// Método 2
        System.out.println("Recorriendo con método 2");
        for (int x = 0; x < canciones.size(); x++) {
            String cancion = canciones.get(x);
            System.out.println(cancion);
        }
// Método 3
        System.out.println("Recorriendo con método 3");
        canciones.forEach((cancion) -> {
            System.out.println(cancion); });
    }
}
