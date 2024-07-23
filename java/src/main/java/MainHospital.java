import java.util.Scanner;

public class MainHospital {
    static int opcionUsuario = -1;
    static Scanner scanner = new Scanner(System.in);
    static GestionHospital gestionHospital = new GestionHospital();
    static HistorialMedico historialMedico = new HistorialMedico();


    public static void mostarMenu() {
        System.out.println("Elija la gestion a realizar");
        System.out.println("---------------------");
        System.out.println("1- Registrar un paciente");
        System.out.println("2- Buscar paciente");
        System.out.println("3- Eliminar paciente");
        System.out.println("4- Agendar cita para control");
        System.out.println("5- Agendar cita para baño");
        System.out.println("6- Agendar cita para vacuna");
        System.out.println("7- Urgencia");
        System.out.println("8- Agendar cirugia");
        System.out.println("9- Cancelar cita");
        System.out.println("10- Ver Historial Medico");
        System.out.println("11- Agregar patologia");
        System.out.println("12- Calcular costos");
    }


    public static void main(String[] args) {
        System.out.println("SISTEMA DE HOSPITAL VETERINARIO");
        System.out.println("----------------------");
        while (opcionUsuario != -1) {
            mostarMenu();
            opcionUsuario = scanner.nextInt();
            switch (opcionUsuario) {
                case 1:
                    gestionHospital.agregarPaciente(crearPaciente());
                    break;
                case 2:
                    gestionHospital.buscarPacienteporNombre(pedirNombreAnimal());
                    break;
                case 3:
                    gestionHospital.eliminarPacienteporNombre(pedirNombreAnimal());
                    break;
                case 4:
                    gestionHospital.reservarTurnoConsulta();
                    break;
                case 5:
                    gestionHospital.reservarTurnoHigiene();
                    break;
                case 6:
                    gestionHospital.reservarTurnoVacuna();
                    break;
                case 7:
                    gestionHospital.reservarTurnoUrgencia();
                    break;
                case 8:
                    gestionHospital.reservarTurnoCirugia();
                    break;
                case 9:
                    gestionHospital.cancelarReserva();
                    break;
                case 10:
                    break;
                case 11:
                    historialMedico.agregarPatologia(crearPatologia());
                    break;
                case 12:
                    break;

            }
        }
    }


    public static Paciente crearPaciente() {
        System.out.println("Ingrese el nombre");
        String nombreAnimal = scanner.next();
        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese la raza");
        String raza = scanner.next();
        return new Paciente(nombreAnimal, edad, raza);
    }

    public static String pedirNombreAnimal() {
        System.out.println("Ingrese el nombre");
        String nombreAnimal = scanner.next();
        return nombreAnimal;
    }

    public static String crearPatologia(){
        System.out.println("Ingrese el nombre");
        String patologia = scanner.next();
        return patologia;
    }

}
