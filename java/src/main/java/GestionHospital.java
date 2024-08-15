import java.util.ArrayList;
import java.util.List;

public class GestionHospital {

    List<Paciente> pacientes;
    List<Veterinario> veterinarios;

    public GestionHospital(){
        pacientes = new ArrayList<>();
        veterinarios = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPacientePorNumeroDeRegistro(int nroRegistro){
        pacientes.removeIf(Paciente -> Paciente.getNumeroRegistro() == nroRegistro);
    }

    public Paciente buscarPacientePorNumeroDeRegistro(int nroRegistro, boolean muestraMensaje){

        Paciente retorno = null;

        for (Paciente paciente : pacientes) {
            if (paciente.getNumeroRegistro() == nroRegistro) {
                retorno = paciente;
            }
        }

        if (retorno != null) {
            if (muestraMensaje)
                System.out.println("Paciente encontrado: " + retorno);
        }
        else {
            System.out.println("No se pudo encontrar paciente para el número de registro ingresado");
        }

        return retorno;
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public Veterinario buscarVeterinarioPorNumeroDeRegistro(int nroRegistro, boolean muestraMensaje){

        Veterinario retorno = null;

        for (Veterinario vet : this.veterinarios) {
            if (vet.getNroRegistro() == nroRegistro) {
                retorno = vet;
            }
        }

        if (retorno != null && muestraMensaje) {
            System.out.println("Veterinario encontrado: " + retorno);
        }
        else {
            System.out.println("No se pudo encontrar veterinario para el número de registro ingresado");
        }

        return retorno;
    }
}
