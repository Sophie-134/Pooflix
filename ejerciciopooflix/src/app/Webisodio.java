package app;

public class Webisodio extends Episodio {
    public Webisodio(int numero, String nombre, int duracionEnMinutos, String url){
        super(numero, nombre, duracionEnMinutos);
        this.url = url;
    }

    public String url;

    @Override //Anotacion que indica que el metodo se sobreescribe (redefinicion)
    public void reproducir(){
            System.out.println("Reproduciendo el webisodio " + this.numero + " de la temporada " + this.temporadas.numero + " llamado "+ this.nombre+ " url: "+this.url);
    
    }
        /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }

}