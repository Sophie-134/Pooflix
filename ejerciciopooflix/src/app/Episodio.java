package app;

public class Episodio {
    public int numero;
    public String nombre;
    public int duracionEnMinutos;
    public String descripcion;
    public Temporada temporadas;
    

    public void reproducir(){
        
        System.out.println("Reproduciendo el capitulo " + this.numero + " de la temporada " + this.temporadas.numero + " llamado "+ this.nombre);
    
    }

}