import java.util.ArrayList;
import java.util.List;

class Veterinario {
    private String nombre;
    private List<Turno> citas;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        this.citas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public List<Turno> getCitas() {
        return citas;
    }

    public boolean tieneCitasDisponibles() {
        for (Turno cita : citas) {
            if (!cita.isReservada()) {
                return true;
            }
        }
        return false;
    }

    public boolean reservarCita(int indice) {
        if (indice >= 0 && indice < citas.size()) {
            Turno cita = citas.get(indice);
            if (!cita.isReservada()) {
                cita.setReservada(true);
                return true;
            }
        }
        return false;
    }

    public void agregarCita(Turno cita) {
        citas.add(cita);
    }
}