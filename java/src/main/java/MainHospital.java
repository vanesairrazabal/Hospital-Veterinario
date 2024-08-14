
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainHospital {
    static int opcionUsuario = -1;
    static Scanner scanner = new Scanner(System.in);
    static HistorialMedico historialMedico = new HistorialMedico();

    public static void mostrarMenu() {
        System.out.println("...................");
        System.out.println("Elija la gestión a realizar");
        System.out.println("---------------------");
        System.out.println("1- Registrar un paciente");
        System.out.println("2- Buscar paciente");
        System.out.println("3- Eliminar paciente");
        System.out.println("4- Mostrar Veterinarios");
        System.out.println("5- Agendar cita para control");
        System.out.println("6- Agendar cita para baño");
        System.out.println("7- Agendar cita para vacuna");
        System.out.println("8- Agendar cirugía");
        System.out.println("9- Urgencia");
        System.out.println("10- Mostrar citas Disponibles");
        System.out.println("11- Registro de consulta");
        System.out.println("12- Ver Historial Medico");
        System.out.println("13- Calcular costos");
    }


    public static void main(String[] args) {
        System.out.println("SISTEMA DE HOSPITAL VETERINARIO");
        System.out.println("----------------------");
        SistemaDeReserva reservaTurno = new SistemaDeReserva();
        GestionHospital gestionHospital = new GestionHospital();

        // Crear veterinarios y citas
        Veterinario vet1 = new Veterinario("Dr.House");
        vet1.agregarCita(new Turno("2024-08-01 09:00"));
        vet1.agregarCita(new Turno("2024-08-01 10:00"));

        Veterinario vet2 = new Veterinario("Dr. Suarez");
        vet2.agregarCita(new Turno("2024-08-01 11:00"));
        vet2.agregarCita(new Turno("2024-08-01 12:00"));

        reservaTurno.agregarVeterinario(vet1);
        reservaTurno.agregarVeterinario(vet2);

        while (true) {
            mostrarMenu();
            opcionUsuario = scanner.nextInt();
            switch (opcionUsuario) {
                case 1:
                    gestionHospital.agregarPaciente(crearPaciente());
                    break;
                case 2:
                    Paciente pacienteEncontrado = gestionHospital.buscarPacienteporNombre(pedirNombreAnimal());
                    System.out.println("Paciente encontrado: " + pacienteEncontrado);
                    break;
                case 3:
                    gestionHospital.eliminarPacienteporNombre(pedirNombreAnimal());
                    break;
                case 4:
                    reservaTurno.mostrarVeterinarios();
                    break;
                case 5:
                    reservaTurno.mostrarVeterinarios();
                    System.out.print("Elige el veterinario (número): ");
                    int indiceVet = scanner.nextInt() - 1;
                    scanner.nextLine();

                    reservaTurno.mostrarCitasDisponibles(indiceVet);
                    System.out.print("Elige la cita (número): ");
                    int indiceCita = scanner.nextInt();
                    scanner.nextLine();

                    boolean exito = reservaTurno.reservarCita(indiceVet, indiceCita);
                    if (exito) {
                        System.out.println("Cita reservada exitosamente.");
                    } else {
                        System.out.println("No se pudo reservar la cita.");
                    }
                    break;

                case 6:
                    reservaTurno.mostrarVeterinarios();
                    System.out.print("Elige el veterinario (número): ");
                    indiceVet = scanner.nextInt() - 1;
                    scanner.nextLine();

                    reservaTurno.mostrarCitasDisponibles(indiceVet);
                    System.out.print("Elige la cita (número): ");
                    indiceCita = scanner.nextInt();
                    scanner.nextLine();

                    exito = reservaTurno.reservarCita(indiceVet, indiceCita);
                    if (exito) {
                        System.out.println("Cita reservada exitosamente.");
                    } else {
                        System.out.println("No se pudo reservar la cita.");
                    }
                    break;
                case 7:
                    reservaTurno.mostrarVeterinarios();
                    System.out.print("Elige el veterinario (número): ");
                    indiceVet = scanner.nextInt() - 1;
                    scanner.nextLine();

                    reservaTurno.mostrarCitasDisponibles(indiceVet);
                    System.out.print("Elige la cita (número): ");
                    indiceCita = scanner.nextInt();
                    scanner.nextLine();

                    exito = reservaTurno.reservarCita(indiceVet, indiceCita);
                    if (exito) {
                        System.out.println("Cita reservada exitosamente.");
                    } else {
                        System.out.println("No se pudo reservar la cita.");
                    }
                    break;
                case 8:
                    reservaTurno.mostrarVeterinarios();
                    System.out.print("Elige el veterinario (número): ");
                    indiceVet = scanner.nextInt() - 1;
                    scanner.nextLine();  // Limpiar el buffer

                    reservaTurno.mostrarCitasDisponibles(indiceVet);
                    System.out.print("Elige la cita (número): ");
                    indiceCita = scanner.nextInt();
                    scanner.nextLine();

                    exito = reservaTurno.reservarCita(indiceVet, indiceCita);
                    if (exito) {
                        System.out.println("Cita reservada exitosamente.");
                    } else {
                        System.out.println("No se pudo reservar la cita.");
                    }
                    break;
                case 9:
                    reservaTurno.mostrarVeterinarios();
                    System.out.print("Elige el veterinario (número): ");
                    indiceVet = scanner.nextInt() - 1;
                    scanner.nextLine();

                    reservaTurno.mostrarCitasDisponibles(indiceVet);
                    System.out.print("Elige la cita (número): ");
                    indiceCita = scanner.nextInt();
                    scanner.nextLine();
                    exito = reservaTurno.reservarCita(indiceVet, indiceCita);
                    if (exito) {
                        System.out.println("Cita reservada exitosamente.");
                    } else {
                        System.out.println("No se pudo reservar la cita.");
                    }
                    break;
                case 10:
                    System.out.println("Ingrese el Veterinario a consultar: 1- Dr.House, 2- Dr.Smith");
                    indiceVet = scanner.nextInt();
                    reservaTurno.mostrarCitasDisponibles(indiceVet);
                    break;
                case 11:
                    Paciente.agregarConsulta(registrarConsulta());
                    break;
                case 12:
                    System.out.println(Paciente.getHistorialMedico());
                    break;
                case 13:
                    mostrarCosto();
                    break;
            }
        }
    }


    public static Paciente crearPaciente() {
        System.out.println("Ingrese el nombre");
        String nombreAnimal = scanner.next();
        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese la especie");
        String especie = scanner.next();
        System.out.println("Ingrese la raza");
        String raza = scanner.next();
        return new Paciente(nombreAnimal, edad, especie, raza);
    }

    public static String pedirNombreAnimal() {
        System.out.println("Ingrese el nombre");
        return scanner.next();
    }

    public static ConsultaMedica registrarConsulta() {
        System.out.println("Ingrese nombre de la mascota");
        String paciente = scanner.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
        String fechaStr = scanner.nextLine();

        Date fecha = null;
        try {
            fecha = sdf.parse(fechaStr);
            System.out.println("Fecha ingresada: " + sdf.format(fecha));
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, use el formato dd/MM/yyyy.");
        }

        System.out.println("Ingrese patologia");
        String patologia = scanner.next();
        System.out.println("Ingrese el medicamento indicado");
        String medicamento = scanner.next();
        System.out.println("Ingrese el costo");
        int costo = scanner.nextInt();
        return new ConsultaMedica(paciente, fecha, medicamento, patologia, costo);
    }
    public static int mostrarCosto(){
        return ConsultaMedica.costo;
    }
}


