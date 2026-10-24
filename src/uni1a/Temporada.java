package uni1a;

public class Temporada {
    private int numeroTemp;
    private int numeroEpisodios;

    public Temporada(int numeroTemp, int numeroEpisodios) {
        this.numeroTemp = numeroTemp;
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroTemp() {
        return numeroTemp;
    }

    public void setNumeroTemp(int numeroTemp) {
        this.numeroTemp = numeroTemp;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }
    
}
