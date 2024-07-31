import java.util.ArrayList;
import java.util.List;

class SistemaDeReserva {
    private List<Veterinario> veterinarios;

    public SistemaDeReserva() {
        this.veterinarios = new ArrayList<>();
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public void mostrarVeterinarios() {
        for (int i = 0; i < veterinarios.size(); i++) {
            System.out.println(i + 1 + ". " + veterinarios.get(i).getNombre());
        }
    }

    public void mostrarCitasDisponibles(int indiceVeterinario) {
        if (indiceVeterinario >= 0 && indiceVeterinario < veterinarios.size()) {
            Veterinario veterinario = veterinarios.get(indiceVeterinario);
            List<Turno> citas = veterinario.getCitas();
            for (int i = 0; i < citas.size(); i++) {
                System.out.println(i + 1 + ". " + citas.get(i));
            }
        }
    }

    public boolean reservarCita(int indiceVeterinario, int indiceCita) {
        if (indiceVeterinario >= 0 && indiceVeterinario < veterinarios.size()) {
            Veterinario veterinario = veterinarios.get(indiceVeterinario);
            return veterinario.reservarCita(indiceCita - 1);
        }
        return false;
    }
}