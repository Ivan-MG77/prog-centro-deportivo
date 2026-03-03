public class CentroDeportivo {

    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;


    public CentroDeportivo(int NUM_MAX_ENTRENADORES) {
        this.NUM_MAX_ENTRENADORES = NUM_MAX_ENTRENADORES;
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }
}
