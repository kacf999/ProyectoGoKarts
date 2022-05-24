package pojos;

public class Carreras {
    int numeroCarrera;
    int vueltas;
    String tiempo;
    String vueltaRapida;
    String Ganador;
    int numPiloto;
    String fecha;

    public Carreras() {
    }
    
    

    public Carreras(int numeroCarrera, int vueltas, String tiempo, String vueltaRapida, String Ganador, int numPiloto, String fecha) {
        this.numeroCarrera = numeroCarrera;
        this.vueltas = vueltas;
        this.tiempo = tiempo;
        this.vueltaRapida = vueltaRapida;
        this.Ganador = Ganador;
        this.numPiloto = numPiloto;
        this.fecha = fecha;
    }

    public int getNumeroCarrera() {
        return numeroCarrera;
    }

    public void setNumeroCarrera(int numeroCarrera) {
        this.numeroCarrera = numeroCarrera;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getVueltaRapida() {
        return vueltaRapida;
    }

    public void setVueltaRapida(String vueltaRapida) {
        this.vueltaRapida = vueltaRapida;
    }

    public String getGanador() {
        return Ganador;
    }

    public void setGanador(String Ganador) {
        this.Ganador = Ganador;
    }

    public int getNumPiloto() {
        return numPiloto;
    }

    public void setNumPiloto(int numPiloto) {
        this.numPiloto = numPiloto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
