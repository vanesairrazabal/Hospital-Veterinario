
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultaMedica {

   Date fecha;
    String medicamento;
    String patología;
    static int costo;

    public ConsultaMedica(String paciente, Date fecha, String medicamento, String patología, int costo) {
        this.fecha = fecha;
        this.medicamento = medicamento;
        this.patología = patología;
        this.costo = costo;
    }

    public ConsultaMedica() {
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

    public String getPatología() {
        return patología;
    }

    public void setPatología(String patología) {
        this.patología = patología;
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
                ", diagnostico='" + patología + '\'' +
                ", costo='" + costo + '\'' +
                '}';
    }
}
