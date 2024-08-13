
import java.util.ArrayList;
import java.util.List;


public class HistorialMedico {

    public List<ConsultaMedica> historial;


    public HistorialMedico() {
        this.historial = new ArrayList<>();
    }

    public void agregarConsulta(ConsultaMedica consulta) {
        historial.add(consulta);
    }

    public List<ConsultaMedica> obtenerHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Historial Médico:\n");
        for (ConsultaMedica consulta : historial) {
            sb.append(consulta.toString()).append("\n");
        }
        return sb.toString();
    }
}

