import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Actor act = new Actor("AAA", "BBBB", LocalDate.of(1999,11,13),
                176,678912345,123);
        Actor act2 = new Actor("bbb", "ccc", LocalDate.of(1999,11,13),
                176,678912345,123);
        Actor act3 = new Actor("ccc", "ddd", LocalDate.of(1999,11,13),
                176,678912345,123);
        Director dic = new Director("dddd","eeee",
                LocalDate.of(1982,11,04),"Terror","123456789K");
        Director dic2 = new Director("dddd","eeee",
                LocalDate.of(1982,11,04),"Terror","123456789K");
        Persona [] participantes = new Persona[4];
        participantes[0] = act;
        participantes[1] = act2;
        participantes[2] = act3;
        participantes[3] = dic;
        Pelicula p = new Pelicula("El juego de ender", 2017,2.32, participantes);

        p.mostrarInfo();
    }
}
