package pojos;

public class Piloto{
    String nombre;
    int edad;
    String sexo;
    String fechaNacimiento;
    String numPiloto;
    String vueltaRapida;

    public Piloto() {
    }

    public Piloto(String nombre, int edad, String sexo, String fechaNacimiento, String numPiloto, String vueltaRapida) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.numPiloto = numPiloto;
        this.vueltaRapida = vueltaRapida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumPiloto() {
        return numPiloto;
    }

    public void setNumPiloto(String numPiloto) {
        this.numPiloto = numPiloto;
    }

    public String getVueltaRapida() {
        return vueltaRapida;
    }

    public void setVueltaRapida(String vueltaRapida) {
        this.vueltaRapida = vueltaRapida;
    }
    
    

    
}
