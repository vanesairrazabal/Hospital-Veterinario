import java.util.ArrayList;
import java.util.List;

public class Veterinario {

    private int nroRegistro;
    private String nombre;
    private List<Turno> citas;

    public int getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(int nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Turno> getCitas() {
        return citas;
    }

    public Veterinario(int numRegistro, String nombre) {
        this.nroRegistro = numRegistro;
        this.nombre = nombre;
        this.citas = new ArrayList<>();
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