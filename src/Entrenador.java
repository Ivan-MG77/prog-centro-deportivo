public class Entrenador {

    //Atributos de la clase Entrenador
    private int id;
    private String nombre;
    private String especialidad;
    private int anosExperiencia;

    /**
     * Metodo COnstructor de la Clase, Siempre En PUBLIC
     * @param id
     * @param nombre
     * @param especialidad
     * @param anosExperiencia
     */
    public Entrenador(int id, String nombre, String especialidad, int anosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    /**
     * Metodo Get del ID
     * @return this.id el id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metodo Get del Nombre
     * @return this.nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo Get de Especialidad
     * @return this.especialidad
     */
    public String getEspecialidad() {
        return this.especialidad;
    }

    /**
     * Metodo Get de Años de Experiencia
     * @return this.anosExperiencia
     */
    public int anosExperiencia() {
        return this.anosExperiencia;
    }

    /**
     * Metodo toString de la Clase Entrenador para pasar todos sus datos en un String
     * Siempre PUBLIC
     * @return sb.toString(); Devuelve tod0 el metodo para que se pase todos los datos
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrenador:");

        sb.append(String.format("\n ID = ", this.id));
        sb.append(String.format("Titulo: %s ", this.nombre));
        sb.append(String.format("Especialidad: %s", this.especialidad));
        sb.append(String.format("Años de Experiencia: %d", this.anosExperiencia));

        return sb.toString();
    }
}
