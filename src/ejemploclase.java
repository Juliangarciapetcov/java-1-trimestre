package tema1;

public class EjercicioCasa {
    public static void main(String[] args) {
        //Me dicen la distancia a la Tierra de la estrella Próxima Centauri, 4.24 años luz
        //Tengo que mostrar la distancia en km y el tiempo en segundos que tardaría
        //una nave que pudiera viajar a una velocidad cercana a la velocidad de
        //la luz -> 298.000 km/s

        //Pista1 -> distancia en km, es pasar 4.24 años luz a kilómetros
        //Pista2 -> tiempo en segundos, una vez sé los km, y se la velocidad a la que voy
        //pues despejar los segundos
        //Pista3 -> velocidad de la luz 299.900 km/s


       final double velocidadluz = 299792.458;
        double distanciaAnios = 4.24;
        double distanciaSegundos = ;
        double distanciaKM = ;


       distanciaSegundos = 365 * 24 * 60 * 60;
        distanciaKM = distanciaSegundos * velocidadluz;

        System.out.println("Distancia en  segundos luz a ProximaCentauri " + distanciaSegundos);
        System.out.println("Distancia en  KM a ProximaCentauri " + distanciaKM);

        final double velocidadNave  = 298000;
        double tiempoNavProximaSegundos, tiempoNavProximaAnios;

        tiempoNaveProximaSegundos = distanciaKm /  velocidadNave;
        tiempoNavProximaAnios = tiempoNaveProximoSegundos / 365 / 24 / 60/ 60;

        System.out.println("Lanave tardaria " + tiempoNaveProxima  + "segundos en llegar");
        System.out.println("La  nave tardaria " + tiempoNaveProximoAnios + "anios en llegar");




    }
}










