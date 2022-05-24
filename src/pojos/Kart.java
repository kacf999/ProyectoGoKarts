package pojos;

public class Kart {
    int numKart;
    String disponibilidad;
    int kilometros;
    String adquisicion;
    int cilindrada;

    public Kart() {
    }
    

    public Kart(int numKart, String disponibilidad, int kilometros, String adquisicion, int cilindrada) {
        this.numKart = numKart;
        this.disponibilidad = disponibilidad;
        this.kilometros = kilometros;
        this.adquisicion = adquisicion;
        this.cilindrada = cilindrada;
    }

    public int getNumKart() {
        return numKart;
    }

    public void setNumKart(int numKart) {
        this.numKart = numKart;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(String adquisicion) {
        this.adquisicion = adquisicion;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
}
