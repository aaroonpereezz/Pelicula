import java.time.LocalDate;

public class Actor extends Persona{
    private int altura;
    private String idioma;
    private int telRepre;
    private int codActor;

    public Actor(String nombre, String apellidos, LocalDate fechaNacimiento, int altura,
                 String idioma, int telRepre, int codActor) {
        super(nombre, apellidos, fechaNacimiento);
        this.altura = altura;
        this.idioma = idioma;
        this.telRepre = telRepre;
        this.codActor = codActor;
    }

    public Actor(String nombre, String apellidos, LocalDate fechaNacimiento, int altura, int telRepre, int codActor) {
        super(nombre, apellidos, fechaNacimiento);
        this.altura = altura;
        this.idioma = "Castellano";
        this.telRepre = telRepre;
        this.codActor = codActor;
    }

    public int getCodActor() {
        return codActor;
    }

    public void setCodActor(int codActor) {
        this.codActor = codActor;
    }

    public int getTelRepre() {
        return telRepre;
    }

    public void setTelRepre(int telRepre) {
        this.telRepre = telRepre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() +
                "altura=" + altura +
                ", idioma='" + idioma + '\'' +
                ", telRepre=" + telRepre +
                ", codActor=" + codActor +
                '}';
    }

    public boolean equals(Actor actor) {
        Actor a = (Actor) actor;

        if(a.getCodActor() == this.codActor){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String getRol(){
        return "Actor";
    }
}
