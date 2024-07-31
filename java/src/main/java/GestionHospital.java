import java.util.ArrayList;
import java.util.List;

public class GestionHospital {
    List<Paciente> pacientes;

    public GestionHospital(){
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);

    }

    public void eliminarPacienteporNombre(String nombreAnimal){
        pacientes.removeIf(Paciente -> Paciente.getNombreAnimal().equals(nombreAnimal));
    }

    public Paciente buscarPacienteporNombre(String nombreAnimal){
        for (Paciente paciente : pacientes) {
            if (paciente.getNombreAnimal().equals(nombreAnimal)) {
                return paciente;
            }
        }
        return null;
    }

}
