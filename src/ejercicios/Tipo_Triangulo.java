package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Tipo_Triangulo {

    private Scanner teclado;
    private int lado1, lado2, lado3;

    public Tipo_Triangulo() {
        
    }
//Declaro el método leer_datos especialmente para leer datos
    public void leer_lados() {
        teclado = new Scanner(System.in);
        System.out.print("Medida lado 1:");
        lado1 = teclado.nextInt();
        System.out.print("Medida lado 2:");
        lado2 = teclado.nextInt();
        System.out.print("Medida lado 3:");
        lado3 = teclado.nextInt();
    }

//Declado el método comparar_datos que define si se puede formar el triangulo, en caso de que si,
//se compara los lados para definir que tipo de triangulo es, en caso de que no, se manda el error
//de que no se puede formar el triangulo
    public void comparar_lados() {
//declado una variable b de tipo boleano, iniciada en falso
        boolean b = false;
//Condicional que decide si el triángulo se puede formar o no
        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
//Si se cumple la condicional anterior, entonces definimos que tipo de triángulo es

            if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
//Si todos sus lados son iguales, entonces se imprime "equilatero"
                System.out.println("Según sus lados es un triángulo equilátero");
//Y se pone la variable ahora en verdadero
                b = true;
            }
//si la variable es falsa, entra en el siguiente condicional
            if (b == false) {
                if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
//Si al menos dos lados son iguales se imprime "Isósceles"
                    System.out.println("Según sus lados es un triángulo isósceles");
                }
            }

            if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
//Si todos los lados son diferentes se imprime "Escaleno"
                System.out.println("Según sus lados es un triángulo escaleno");
            }

        } else {
//Sino se cumple el primer condicional se imprime que no se puede formar el triángulo
            System.out.println("[ERROR] No se puede formar el triángulo");
        }
    }

//El método principal en el cual se mandan a llamar todos los métodos
    public static void main(String[] args) {
//Creo un onjeto de tipo triangulo, para poder usar los métods de esa clase
        Tipo_Triangulo llamar = new Tipo_Triangulo();
//Mando a llamar el método leer_datos
        llamar.leer_lados();
//Mando a llamar el método comparar_lados
        llamar.comparar_lados();
    }
}
