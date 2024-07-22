import java.util.Scanner;

public class MainHospital {
    static int opcionUsuario = -1;
    static Scanner scanner = new Scanner(System.in);
    static GestionHospital gestionHospital = new GestionHospital();
    static Paciente paciente = new Paciente();


    public void mostarMenu(){
        System.out.println("Elija la gestion a realizar");
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
        opcionUsuario = scanner.nextInt();
        switch (opcionUsuario){
            case 1:
                gestionHospital.agregarPaciente(paciente);
                break;
            case 2:
                gestionHospital.buscarPaciente(paciente.getNombreAnimal());
                break;
                

        }
    }
}
