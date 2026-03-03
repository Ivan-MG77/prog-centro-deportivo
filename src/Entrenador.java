public class Entrenador {

    private int id;
    private String nombre;
    private String especialidad;
    private int anosExperiencia;

    public Entrenador(int id, String nombre, String especialidad, int anosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public int anosExperiencia() {
        return this.anosExperiencia;
    }

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
