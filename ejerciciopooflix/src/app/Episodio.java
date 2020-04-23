package app;

public class Episodio {
    public Episodio(int numero, String nombre, int duracionEnMinutos) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private int numero;
    private String nombre;
    private int duracionEnMinutos;
    private String descripcion;
    private Temporada temporadas;

    // c sharp
    // punlic int numer(get;set;)

    // Getter /Setter -> Get-> devolver el valor de un atributo. El Set va a
    // ponerle.
    // Getter
    public int getNumero() {
        return this.numero;
    }

    // Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Temporada getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(Temporada temporadas) {
        this.temporadas = temporadas;
    }

    public void reproducir() {
        System.out.println("Reproduciendo el capitulo " + this.numero + " de la temporada "
                + this.temporadas.getNumero() + " llamado " + this.nombre);

    }

}