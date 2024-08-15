import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private int numeroRegistro;
    private String nombreAnimal;
    private int edad;
    private String razaAnimal;
    private String especie;
    private HistorialMedico historialMedico;

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    public void agregarConsulta(ConsultaMedica consulta) {
        this.historialMedico.agregarConsulta(consulta);
    }

    public HistorialMedico getHistorialMedico() {
        return this.historialMedico;
    }

    public Paciente(int nroRegistro, String nombreAnimal, int edad, String razaAnimal, String especie) {
        this.numeroRegistro = nroRegistro;
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
        this.especie = especie;
        this.historialMedico = new HistorialMedico();
    }

    public int calcularCostos() {
        int retorno = 0;
        for (ConsultaMedica consulta : this.historialMedico.obtenerHistorial()) {
            if (consulta.isPagoPendiente()) {
                retorno += consulta.getCosto();
            }
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                ", edad=" + edad +
                ", razaAnimal='" + razaAnimal + '\'' +
                ", historialMedico=" + historialMedico +
                '}';
    }
}
