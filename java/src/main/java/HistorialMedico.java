import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    List<String> patologias = new ArrayList<String>();

    public void agregarPatologia(String patologia){
        patologias.add(patologia);
    }

    public void eliminarPatologia(String patologia){
        patologias.remove(patologia);
    }


}
