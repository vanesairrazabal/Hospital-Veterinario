import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    List<String> patologias = new ArrayList<String>();

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    String nombrePatologia;

    public HistorialMedico(List<String> patologias) {
        this.patologias = patologias;
    }

    public HistorialMedico() {

    }

    public void agregarPatologia(String patologia) {
        patologias.add(patologia);
    }

    public void eliminarPatologia(String patologia) {
      patologias.remove(patologia);
    }


    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }

    public List<String> getPatologias() {
        return patologias;
    }

    public void setPatologias(List<String> patologias) {
        this.patologias = patologias;
    }
}
