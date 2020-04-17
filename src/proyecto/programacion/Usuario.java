package proyecto.programacion;


public class Usuario {
    String nombre;
    int cedula;
    int numTarjeta;
    String localizacion;
    int numTelefono;

    public Usuario(String nombre, int cedula, int numTarjeta, String localizacion, int numTelefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numTarjeta = numTarjeta;
        this.localizacion = localizacion;
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", cedula=" + cedula + ", numTarjeta=" + numTarjeta + ", localizacion=" + localizacion + ", numTelefono=" + numTelefono + '}';
    }
    
    
    

}
