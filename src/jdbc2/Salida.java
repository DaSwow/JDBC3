



package jdbc2;

public class Salida {
    
    private String horaSalida;
    private String fechaSalida;
    private String destino;
    private int matriculaBarco;

    public Salida() {
    }

    public Salida(String horaSalida, String fechaSalida, String destino, int matriculaBarco) {
        this.horaSalida = horaSalida;
        this.fechaSalida = fechaSalida;
        this.destino = destino;
        this.matriculaBarco=matriculaBarco;
      
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

    public int getMatriculaBarco() {
        return matriculaBarco;
    }

    public void setMatriculaBarco(int matriculaBarco) {
        this.matriculaBarco = matriculaBarco;
    }

  
    
    
}
