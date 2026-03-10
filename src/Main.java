public class Main {
    public static void main(String[] args) {

        CentroDeportivo centroDeportivo = new CentroDeportivo(7);

        Entrenador entrenador1 = new Entrenador(1,"Osso", "Fisio", 1);
        Entrenador entrenador2 = new Entrenador(2,"Almeida", "Cardio", 12);
        Entrenador entrenador3 = new Entrenador(3,"Salas", "Pesas", 33);

        System.out.println(centroDeportivo.buscarEntrenador(1));

        centroDeportivo.registrarEntrenador(entrenador1);
        centroDeportivo.registrarEntrenador(entrenador2);
        centroDeportivo.registrarEntrenador(entrenador3);


        System.out.println(centroDeportivo.mostrarEntrenadores());

        System.out.println("Total de entrenadores: " + centroDeportivo.contarEntrenadores());




    }
}