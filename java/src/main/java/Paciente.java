public class Paciente {
    String nombreAnimal;
    int edad;
    String razaAnimal;


    public Paciente(String nombreAnimal, int edad, String raza) {
    }

    public Paciente(int edad, String nombreAnimal, String razaAnimal) {
        this.edad = edad;
        this.nombreAnimal = nombreAnimal;
        this.razaAnimal = razaAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                ", edad=" + edad +
                ", razaAnimal='" + razaAnimal + '\'' +
                '}';
    }
}
