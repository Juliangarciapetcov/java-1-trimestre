import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        //Leer el radio de un circulo y calcular e imprimir su area y longitud

        //Analisis
        //Datos  de entrada: radio de la circunferencia
        //datos de la salida: area y longitud de la circunferencia
        //Diseño
        //area = PI * radio * radio
        //longitud = PI * 2 * radio

        //1. DECLARACION DE VARIABLES
          double radio;
          double area, longitud;

          //2.LEER DATOS DE ENTRADA
        Scanner sc = new Scanner(System.in); //* Crea el objeto para leer de teclado
        System.out.println();
        radio = sc.nextDouble(); //Leer de teclado un decimal
        System.out.println("El radio es " + radio);

        //3. Hacer Calculos
        area = 3.1415 * radio * radio; // PI* r2
        longitud = 2 * 3.1415 * radio * radio; //2 * PI * r

        //4. Mostrar resultados
        System.out.println("El area es " + area);
        System.out.println("El longitud es " + longitud);

    }






}
