import java.util.Scanner;

public class ejercicioclase {
    public static void main(String[] args) {

    //Ejercicio clase
    //Tenemos que diseñar un programa que pida por teclado tres temperaturas
    // Tiene que mostrar como salida la temperatura media de esos tres
    // Realizar analisis , diseño y codificacion

    //Analisis
    double temperatura1 ;
    double temperatura2 ;
    double temperatura3 ;
    double temperaturaMedia ;

    // Diseño
        Scanner sc = new Scanner(System.in);
        System.out.println("temperatura1");
        temperatura1 = sc.nextDouble();
        System.out.println("temperatura2");
        temperatura2 = sc.nextDouble();
        System.out.println("temperatura3");
        temperatura3 = sc.nextDouble();

    // Ahora hay que hacer el resultado entre ellos
        temperaturaMedia = (temperatura1 + temperatura2 + temperatura3) / 3;
        System.out.println("La temperatura media es = " + temperaturaMedia);





    }

}
