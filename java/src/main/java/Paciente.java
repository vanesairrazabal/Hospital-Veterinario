import java.util.ArrayList;
import java.util.List;

public class Paciente {
    String nombreAnimal;
    int edad;
    String razaAnimal;
    String especie;
    HistorialMedico historialMedico;


    public Paciente(String nombreAnimal, int edad, String razaAnimal, String especie) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
        this.especie = especie;
        this.historialMedico = new HistorialMedico();


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
        historialMedico.agregarConsulta(consulta);
    }


    public HistorialMedico getHistorialMedico() {
        return historialMedico;
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
