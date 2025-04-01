import java.time.LocalDate;

public class Director extends Persona{
    private String dni;
    private String genero;

    public Director(String nombre, String apellidos, LocalDate fechaNacimiento, String genero, String dni) {
        super(nombre, apellidos, fechaNacimiento);
        this.genero = genero;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +
                "dni='" + dni + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public boolean equals(Director director) {
        Director o = (Director) director;
        if(o.getDni() == this.getDni()){
            return true;
        }else {
            return false;
        }
    }
}
