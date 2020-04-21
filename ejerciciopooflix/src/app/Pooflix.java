package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarElMundoOcultoDeSabrina();
        this.inicializarumbrella();

    }

    public void inicializarElMundoOcultoDeSabrina() {
        Serie sabrina = new Serie();
        sabrina.nombre = "El mundo oculto de Sabrina";
        this.series.add(sabrina);

        Temporada temp1 = new Temporada();
        temp1.numero = 1;
        sabrina.temporadas.add(temp1);
        Episodio ep1temp1sab = new Episodio();
        ep1temp1sab.nombre = "El país de octubre";
        ep1temp1sab.numero = 1;
        ep1temp1sab.temporadas = temp1;
        temp1.episodios.add(ep1temp1sab);

        Webisodio webi = new Webisodio();
        webi.numero = 666;
        webi.nombre = "Especial de navidad";
        webi.url = "http://pooflix.com";

        temp1.episodios.add(webi);
        webi.temporadas = temp1;
        
        Episodio ep2tem1sab = new Episodio();
        ep2tem1sab.nombre = "El bautismo oscuro";
        ep2tem1sab.numero = 2;
        ep2tem1sab.temporadas = temp1;
        temp1.episodios.add(ep2tem1sab);

        Temporada temp2 = new Temporada();
        temp2.numero = 2;
        sabrina.temporadas.add(temp2);
        Episodio ep12temp2sab = new Episodio();
        ep12temp2sab.nombre = "La epifanía";
        ep12temp2sab.numero = 12;
        ep12temp2sab.temporadas = temp2;
        temp2.episodios.add(ep12temp2sab);
        Episodio ep13temp2sab = new Episodio();
        ep13temp2sab.nombre = "La pasión de Sabrina Spellman";
        ep13temp2sab.numero = 13;
        ep13temp2sab.temporadas = temp2;
        temp2.episodios.add(ep13temp2sab);

        Clasificacion classab = new Clasificacion();
        classab.descripcion ="Mayor a 16";
        classab.edadMinima = 16;
        classab.tipo = "M";

        sabrina.clasificacion =classab;

        Genero gensab = new Genero();
        gensab.nombre = "Ficción sobrenatural";
        sabrina.genero = gensab;

        sabrina.anio = 2018;
        sabrina.descripcion = "La magia y las travesuras marcan el rumbo de Sabrina, una adolescente de doble naturaleza que se debate entre el mundo de los mortales y el que se oculta debajo.";
        sabrina.calificacion =7.77;
        
        Actor actorsab = new Actor();
        actorsab.nombre ="Kiernan Shipka";
        sabrina.elenco.add(actorsab);

        this.series.add(sabrina);

        

    }

    public void inicializarumbrella() {
        Serie umbrella = new Serie();
        umbrella.nombre = "The Umbrella Academy";
        this.series.add(umbrella);

        Temporada tem1umb = new Temporada();
        tem1umb.numero = 1;
        umbrella.temporadas.add(tem1umb);
        Episodio ep1tem1umb = new Episodio();
        ep1tem1umb.nombre = "Solo nos vemos en los casamientos o velorios";
        ep1tem1umb.numero = 2;
        ep1tem1umb.temporadas = tem1umb;
        tem1umb.episodios.add(ep1tem1umb);
        Episodio ep2tem1umb = new Episodio();
        ep2tem1umb.nombre = "Run Boy Run";
        ep2tem1umb.numero = 2;
        ep2tem1umb.temporadas = tem1umb;
        tem1umb.episodios.add(ep2tem1umb);
        Episodio ep3tem1umb = new Episodio();
        ep3tem1umb.nombre = "Extra Ordinaria";
        ep3tem1umb.numero = 3;
        ep3tem1umb.temporadas = tem1umb;
        tem1umb.episodios.add(ep3tem1umb);

        /*Episodio ep =new Episodio();
        ep.numero = 5;
        ep.nombre="";
        ep.duracion =43;

        t5.episodios.add(ep);

        ep=new Episodio();
        ep.numero =5
        ep.nombre ="";
        ep.duracion=41;
        t5.episodios.add(ep);*/
            
    }

}