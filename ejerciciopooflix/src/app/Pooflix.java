package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarElMundoOcultoDeSabrina();
        this.inicializarumbrella();

    }

    public void inicializarElMundoOcultoDeSabrina() {
        /*Clasificacion atp = new Clasificacion();*/

        Serie sabrina = new Serie();
        sabrina.setNombre("El mundo oculto de Sabrina");
        this.series.add(sabrina);

        Temporada temp1 = new Temporada();
        temp1.setNumero(1);
        sabrina.getTemporadas().add(temp1);
        Episodio ep1temp1sab = new Episodio(1, "El país de octubre", 60);

        /*
         * ep1temp1sab.nombre = "El país de octubre"; ep1temp1sab.numero = 1;
         */
        ep1temp1sab.setTemporadas(temp1);
        temp1.getEpisodios().add(ep1temp1sab);

        Webisodio webi = new Webisodio(666, "Especial de navidad", 20, "http://pooflix.com");
        /*
         * webi.numero = 666; webi.nombre = "Especial de navidad"; 
         * webi.url ="http://pooflix.com";
         */

        temp1.getEpisodios().add(webi);
        webi.setTemporadas(temp1);

        Episodio ep2tem1sab = new Episodio(2, "El bautismo oscuro", 60);
        /*
         * ep2tem1sab.nombre = "El bautismo oscuro"; 
         * ep2tem1sab.numero = 2;
         */
        ep2tem1sab.setTemporadas(temp1);
        temp1.getEpisodios().add(ep2tem1sab);

        Temporada temp2 = new Temporada();
        temp2.setNumero(2);
        sabrina.getTemporadas().add(temp2);
        Episodio ep12temp2sab = new Episodio(12, "La epifanía", 60);
        /*
         * ep12temp2sab.nombre = "La epifanía"; ep12temp2sab.numero = 12;
         */
        ep12temp2sab.setTemporadas(temp2);
        temp2.getEpisodios().add(ep12temp2sab);
        Episodio ep13temp2sab = new Episodio(13, "La pasión de Sabrina Spellman", 60);
        /*
         * ep13temp2sab.nombre = "La pasión de Sabrina Spellman"; ep13temp2sab.numero =
         * 13;
         */
        ep13temp2sab.setTemporadas(temp2);
        temp2.getEpisodios().add(ep13temp2sab);

        Clasificacion classab = new Clasificacion("M", 16);
        /*classab.setEdadMinima(16);
        classab.setTipo("M");*/
        classab.setDescripcion("Mayor a 16");

        sabrina.setClasificacion(classab);

        Genero gensab = new Genero("Ficción sobrenatural");
        /*gensab.setNombre("Ficción sobrenatural");*/
        sabrina.setGenero(gensab);

        sabrina.setAnio(2018);
        sabrina.setDescripcion("La magia y las travesuras marcan el rumbo de Sabrina, una adolescente de doble naturaleza que se debate entre el mundo de los mortales y el que se oculta debajo.");
        sabrina.setCalificacion(7.77);

        Actor actorsab = new Actor();
        actorsab.setNombre("Kiernan Shipka");
        sabrina.getElenco().add(actorsab);

        this.series.add(sabrina);

    }

    public void inicializarumbrella() {
        Serie umbrella = new Serie();
        umbrella.setNombre("The Umbrella Academy");
        this.series.add(umbrella);

        Temporada tem1umb = new Temporada();
        tem1umb.setNumero(1);
        umbrella.getTemporadas().add(tem1umb);
        Episodio ep1tem1umb = new Episodio(1, "Solo nos vemos en los casamientos o velorios", 60);
        /*
         * ep1tem1umb.nombre = "Solo nos vemos en los casamientos o velorios";
         * ep1tem1umb.numero = 1;
         */
        ep1tem1umb.setTemporadas(tem1umb);
        tem1umb.getEpisodios().add(ep1tem1umb);
        Episodio ep2tem1umb = new Episodio(2, "Run Boy Run", 70);
        /*
         * ep2tem1umb.nombre = "Run Boy Run"; ep2tem1umb.numero = 2;
         */
        ep2tem1umb.setTemporadas(tem1umb);
        tem1umb.getEpisodios().add(ep2tem1umb);
        Episodio ep3tem1umb = new Episodio(3, "Extra Ordinaria", 65);
        /*
         * ep3tem1umb.nombre = "Extra Ordinaria"; ep3tem1umb.numero = 3;
         */
        ep3tem1umb.setTemporadas(tem1umb);
        tem1umb.getEpisodios().add(ep3tem1umb);

        /*
         * Episodio ep =new Episodio(); ep.numero = 5; ep.nombre=""; ep.duracion =43;
         * 
         * t5.episodios.add(ep);
         * 
         * ep=new Episodio(); ep.numero =5 ep.nombre =""; ep.duracion=41;
         * t5.episodios.add(ep);
         */

    }

}