public class CentroDeportivo {

    //Atributos de la clase CentroDeportivo
    private Entrenador[] entrenadores;  //Array de tipo Entrenador con los Entrenadores
    private final int NUM_MAX_ENTRENADORES;


    /**
     * Metodo contructor de la clase CentroDeportivo
     * @param NUM_MAX_ENTRENADORES
     */
    public CentroDeportivo(int NUM_MAX_ENTRENADORES) {
        this.NUM_MAX_ENTRENADORES = NUM_MAX_ENTRENADORES;
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }

    /**
     * Metodo PUBLICO que busca un entrenador por un ID en el array entrenadores
     * @param id
     * @return entrenadorEncontrado Devuelve el ID del entrenador que ha sido encontrado en la Variable "entrenadorEncontrado" que en ella se guarda "entrenadores[i]"
     */
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

    private int buscarPrimerHuecoLibre(){
        int primeraPosicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] == null) {
                primeraPosicionLibre = i;
                seguirBuscando = false;
            }
        }
        return primeraPosicionLibre;
    }

    public boolean registrarEntrenador(Entrenador entrenador){
        boolean resultadoRegistrar = false;
        int hueco = buscarPrimerHuecoLibre();

        if (entrenador != null && hueco != -1 && buscarEntrenador(entrenador.getId()) == null) {
            entrenadores[hueco] = entrenador;
            resultadoRegistrar = true;
        }
        return resultadoRegistrar;
    }




    public String mostrarEntrenadores(){

        StringBuilder sb = new StringBuilder("Entrenadores: {");

        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                sb.append(entrenadores[i].toString());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    public int contarEntrenadores(){
        int contador = 0;

        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                contador++;

            }
        }
        return contador;
    }
}
