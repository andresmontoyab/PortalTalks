import java.util.Arrays;
import java.util.List;

public class Class4 {
    /**
     * HomeWork
     * 1. Crear un array de 30 posiciones
     * 2. Recorrer (while y for) el array y retornar la suma de todos los elementos
     * 3. Recorrer (while y for) el array y retornar el producto de los elementos de las posiciones impares
     * 4. Recorrer (while y for) el array de forma inversa y la suma del producto de la posicion por el elemento.
     */

    /**
     * Swicht - done
     * Array - done
     * While - For - done
     */

    public static void main(String[] args) {
        //swichtDocumentation();
        //whileDocumentation(arrayEdades);
        //forDocumentation();
    }

    private static void forDocumentation() {
        int[] arrayEdades = new int[8];
        arrayEdades[0] = 15;
        arrayEdades[1] = 13;
        arrayEdades[2] = 12;
        arrayEdades[3] = 11;
        arrayEdades[4] = 15;
        arrayEdades[5] = 15;
        // Loops

        // -> Que pasa si tengo miles o millones datos?
        // For ->

        for (int i = 0; i < arrayEdades.length; i++) {
            System.out.println("Value is " + arrayEdades[i]);
        }
    }

    private static void whileDocumentation(int[] arrayEdades) {
        int i = 0;
        while(i < arrayEdades.length) {
            System.out.println("Value is " + arrayEdades[i]);
            i = i+1;
        }
    }

    private static void swichtDocumentation() {
        // Is another way to write if conditionals
        String opcionSelecciona = "1";
        switch (opcionSelecciona ) {
            case "1":
                System.out.println("Este man paga las polas");
                break;
            case "2":
                System.out.println("Este man da clase");
                break;
            case "3":
                System.out.println("Just another man");
                break;
            case "4":
                System.out.println("El hombre del tequila");
                break;
            case "5":
                System.out.println("This is the lastman");
                break;
        }
    }
}
