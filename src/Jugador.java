/**
 * El jugador (capità Bond). Té una zona actual i un inventari.
 */
public class Jugador {

    private String nom;
    private Zona zonaActual;
    private Inventari inventari;
    private boolean portaVestitEspacial;

    public Jugador(String nom, Zona zonaInicial) {
        this.nom = nom;
        this.zonaActual = zonaInicial;
        this.inventari = new Inventari();
        this.portaVestitEspacial = false;
    }

    public String getNom() {
        return nom;
    }

    public Zona getZonaActual() {
        return zonaActual;
    }

    public void moureA(Zona novaZona) {
        this.zonaActual = novaZona;
    }

    public Inventari getInventari() {
        return inventari;
    }

    public boolean isPortaVestitEspacial() {
        return portaVestitEspacial;
    }

    public void setPortaVestitEspacial(boolean portaVestitEspacial) {
        this.portaVestitEspacial = portaVestitEspacial;
    }
}
