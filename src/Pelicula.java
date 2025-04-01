import java.util.Arrays;

public class Pelicula {
    private String nombre;
    private int año;
    private double duracion;
    private Persona[] participantes = new Persona[4];


    public Pelicula(String nombre, int año, double duracion, Persona[] participantes) {
        this.participantes = participantes;
        int contDir = 0;
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i].getClass().getSimpleName().equals("Director")) {
                contDir++;
            }
        }
        if (contDir == 0 || contDir >1) {
            System.out.println("No se puede introducir mas de un director");
        }else {
            this.nombre = nombre;
            this.año = año;
            this.duracion = duracion;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Persona[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Persona[] participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                ", duracion=" + duracion +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }


    public boolean equals(Pelicula pelicula) {
        Pelicula p = (Pelicula) pelicula;

        if(p.getNombre() == this.nombre &&  p.getAño() == this.año){
            return true;
        }else{
            return false;
        }
    }

    public void mostrarInfo() {
        Director director = null;
        List<Persona> actores = new ArrayList<>();

        for (Persona p : participantes) {
            if (p instanceof Director) {
                director = (Director) p;
            } else {
                actores.add(p);
            }
        }

        System.out.println("Actores:");
        actores.forEach(actor -> System.out.println(actor.toString()));

        System.out.println("Director: " + (director != null ? director.toString() : "No especificado"));
    }
}
