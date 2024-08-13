

public class ConsultaMedica {

    String fecha;
    String medicamento;
    String patología;
    int costo;

    public ConsultaMedica(String paciente, String fecha, String medicamento, String patología, int costo) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
