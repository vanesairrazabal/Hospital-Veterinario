
class Turno {
    private String fechaHora;
    private boolean reservada;

    public Turno(String fechaHora) {
        this.fechaHora = fechaHora;
        this.reservada = false;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    @Override
    public String toString() {
        return "Fecha y Hora: " + fechaHora + (reservada ? " (Reservada)" : " (Disponible)");
    }
}