/**
 * Personatge del joc amb qui es pot "PARLAR". No té intel·ligència real,
 * només reacciona a certes paraules clau (segons diu l'enunciat).
 * Serveix de base per a iHall, "Malien" i els companys de tripulació.
 */
public class Personatge {

    private String nom;
    private Zona zonaActual;

    public Personatge(String nom, Zona zonaActual) {
        this.nom = nom;
        this.zonaActual = zonaActual;
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

    /**
     * Reacció a una paraula/frase que li diu el jugador.
     * S'ha de sobreescriure a cada subclasse (iHall, Malien, Company...)
     * per reaccionar només a certes paraules clau, tal com demana l'enunciat.
     */
    public String parlar(String frase) {
        // TODO: cada personatge reacciona de manera diferent segons la paraula/frase
        return nom + " no sap què respondre a això.";
    }
}
