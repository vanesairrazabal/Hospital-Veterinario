import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class MainHospitalTest {

    Paciente paciente = new Paciente(1,"coco", 3, "Dogo","perro");
    GestionHospital gestionHospital = new GestionHospital();
    SistemaDeReserva reservaDeTurno = new SistemaDeReserva();
    Veterinario veterinario1 = new Veterinario(5422, "Dr.House");
    Veterinario veterinario2 = new Veterinario(8514, "Dr.Smith");

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date fecha = sdf.parse("14/08/2024");
    ConsultaMedica consultaMedica = new ConsultaMedica(paciente, veterinario1, fecha, "paracetamol","dolor abdominal", 3600);

    MainHospitalTest() throws ParseException {
    }


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarPaciente() {
        gestionHospital.agregarPaciente(paciente);
    }

    @Test
    void buscarPacientePorNumeroDeRegistro() {
        gestionHospital.agregarPaciente(paciente);
        gestionHospital.buscarPacientePorNumeroDeRegistro(paciente.getNumeroRegistro(), false);
        assertEquals(null, gestionHospital.buscarPacientePorNumeroDeRegistro(8, false));
        assertEquals(1, gestionHospital.buscarPacientePorNumeroDeRegistro(paciente.getNumeroRegistro(), false).getNumeroRegistro());
    }

    @Test
    void eliminarPacientePorNumeroDeRegistro() {
        gestionHospital.eliminarPacientePorNumeroDeRegistro(paciente.getNumeroRegistro());
    }

    @Test
    void agregarVeterinario() {
       reservaDeTurno.agregarVeterinario(veterinario2);
       reservaDeTurno.agregarVeterinario(veterinario1);
    }

    @Test
    void reservarCita() {
        reservaDeTurno.agregarVeterinario(veterinario2);
        reservaDeTurno.agregarVeterinario(veterinario1);
        reservaDeTurno.reservarCita(1, 2);
        reservaDeTurno.reservarCita(2, 1);
    }

    @Test
    void mostrarCitasDisponibles(){
        reservarCita();
        reservaDeTurno.mostrarCitasDisponibles(1);
        reservaDeTurno.mostrarCitasDisponibles(2);
    }
    @Test
    void agregarConsulta(){
        paciente.agregarConsulta(consultaMedica);
    }
}