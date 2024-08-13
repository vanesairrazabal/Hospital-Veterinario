import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHospitalTest {

    Paciente paciente = new Paciente("coco", 3, "Dogo","perro");
    GestionHospital gestionHospital = new GestionHospital();
    SistemaDeReserva reservaDeTurno = new SistemaDeReserva();
    Veterinario veterinario1 = new Veterinario("Dr.House");
    Veterinario veterinario2 = new Veterinario("Dr.Smith");

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
    void buscarPacienteporNombre() {
        gestionHospital.buscarPacienteporNombre(paciente.nombreAnimal);
       assertEquals(gestionHospital.buscarPacienteporNombre(paciente.razaAnimal),gestionHospital.buscarPacienteporNombre(paciente.nombreAnimal));
    }

    @Test
    void eliminarPacienteporNombre() {
        gestionHospital.eliminarPacienteporNombre(paciente.nombreAnimal);
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
}