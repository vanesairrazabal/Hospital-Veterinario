import java.util.ArrayList;
import java.util.List;

public class GestionHospital {
    List<Paciente> pacientes;

    public void GestionHospital(){
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);

    }

    public void eliminarPaciente(String nombreAnimal){
        pacientes.removeIf(Paciente -> Paciente.getNombreAnimal().equals(nombreAnimal));
    }

    public Paciente buscarPaciente(String nombreAnimal){
        for (Paciente paciente : pacientes) {
            if (paciente.getNombreAnimal().equals(nombreAnimal)) {
                return paciente;
            }
        }
        return null;
    }

    public void reservarTurnoConsulta(){

    }
    public void reservarTurnoUrgencia(){

    }

    public void reservarTurnoHigiene(){

    }

    public void reservarTurnoCirujia(){

    }

    public void reservarTurnoVacuna(){

    }
}