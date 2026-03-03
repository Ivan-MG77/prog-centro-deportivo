public class CentroDeportivo {

    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;


    public CentroDeportivo(int NUM_MAX_ENTRENADORES) {
        this.NUM_MAX_ENTRENADORES = NUM_MAX_ENTRENADORES;
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }

    public Entrenador buscarEntrenador(int id){
        boolean seguirBuscando = true;
        Entrenador entrenadorEncontrado = null;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] != null && entrenadores[i].getId() == id) {
                seguirBuscando = false;
                entrenadorEncontrado = entrenadores[i];

            }
        }
        return entrenadorEncontrado;
    }

}
