
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultaMedica {

    private Paciente paciente;
    private Veterinario veterinario;
    private Date fecha;
    private String medicamento;
    private String patologia;
    private boolean pagoPendiente;
    private int costo;

    public ConsultaMedica() {
    }

    public ConsultaMedica(Paciente paciente, Veterinario veterinario, Date fecha, String medicamento, String patologia, int costo) {
        this.paciente = paciente;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.medicamento = medicamento;
        this.patologia = patologia;
        this.costo = costo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public boolean isPagoPendiente() {
        return pagoPendiente;
    }

    public void setPagoPendiente(boolean pagoPendiente) {
        this.pagoPendiente = pagoPendiente;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Cambia el formato según lo necesites
        return sdf.format(fecha);
    }

    @Override
    public String toString() {
        return "ConsultaMedica{" +
                "fecha='" + fecha + '\'' +
                ", medicamento='" + medicamento + '\'' +
                ", diagnostico='" + patologia + '\'' +
                ", costo='" + costo + '\'' +
                '}';
    }
}
