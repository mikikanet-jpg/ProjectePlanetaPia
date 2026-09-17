/**
 * Representa un objecte del joc (eina, llanterna, vestit espacial, tarja, dònuts...).
 * Un objecte pot ser agafable cap a l'inventari, es pot deixar en una zona,
 * i es pot "usar" sobre un altre element (una porta, els propulsors, en "Malien"...).
 */
public class Objecte {

    private String nom;
    private String descripcio;
    private boolean agafable;

    public Objecte(String nom, String descripcio, boolean agafable) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.agafable = agafable;
    }

    public String getNom() {
        return nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public boolean isAgafable() {
        return agafable;
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Objecte)) return false;
        Objecte altre = (Objecte) obj;
        return nom.equalsIgnoreCase(altre.nom);
    }

    @Override
    public int hashCode() {
        return nom.toLowerCase().hashCode();
    }
}
