package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("El mundo oculto de Sabrina");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(666);

        elTop.reproducir();

        // ejecucion inline
        //
        /*
         * Webisodio webi = laMejorTemporada.getWebisodio(1);
         * 
         * webi.reproducir(); System.out.println("Url: "+webi.url);
         */

        System.out.println("Empezando otra cosa");
        Episodio epiDemo;

        int posicion = 0;
        /// En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // priero: preguntar si es un objeto de X tipo, usando el operados "instanceof"
        // segundo: usando el operador de casteo(es decir, "transformando"/casteando la
        // referencia)
        if (epiDemo instanceof Webisodio) {
            Webisodio webi = (Webisodio) epiDemo;
            webi.enviarAlertaDeQueEstaOnline();
        }else {
            System.out.println("No hay webisodios");
        }

        /*
         * doubler numeroReal = 2.9; 
         * int numero Entero =(int)numeroREal; 
         * numeroEntero = 2;
         */

        

    }
}