



package jdbc2;

public class Salida {
    
    private String horaSalida;
    private String fechaSalida;
    private String destino;
    private int numeroMatricula;

    public Salida() {
    }

    public Salida(String horaSalida, String fechaSalida, String destino, int numeroMatricula) {
        this.horaSalida = horaSalida;
        this.fechaSalida = fechaSalida;
        this.destino = destino;
        this.numeroMatricula = numeroMatricula;
    }

    
    
    
    
    
    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    
    
    
}
