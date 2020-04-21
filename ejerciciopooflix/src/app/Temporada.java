package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int nro) {
        for (Episodio episod : this.episodios) {
            if (episod.numero == nro) {
                return episod;
            }
        }
        return null;

    }

    /**
     * obtiene un episodio en base a la posicion dentro del ArrayList. Recordar que
     * los ArrayList la primer posicion es la 0
     */
    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

    public List<Webisodio> obtenerWebsodios() {
        List<Webisodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Webisodio)
                lista.add((Webisodio) epi);
        }
        return lista;
    }

}