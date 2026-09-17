import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa una zona/habitació de la nau PiaXXII (Oficines, Tallers, Vestuari...).
 * Cada zona té una descripció, unes sortides cap a altres zones i,
 * opcionalment, objectes que hi són presents.
 */
public class Zona {

    private String nom;
    private String descripcio;
    private Map<String, Zona> sortides;   // clau: direcció o nom de la zona destí
    private List<Objecte> objectes;
    private boolean visitada;

    public Zona(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.sortides = new HashMap<>();
        this.objectes = new ArrayList<>();
        this.visitada = false;
    }

    public void afegirSortida(String direccio, Zona destinacio) {
        sortides.put(direccio.toUpperCase(), destinacio);
    }

    public Zona getSortida(String direccio) {
        return sortides.get(direccio.toUpperCase());
    }

    public Map<String, Zona> getSortides() {
        return sortides;
    }

    public void afegirObjecte(Objecte objecte) {
        objectes.add(objecte);
    }

    public boolean treureObjecte(Objecte objecte) {
        return objectes.remove(objecte);
    }

    public Objecte buscarObjecte(String nomObjecte) {
        for (Objecte o : objectes) {
            if (o.getNom().equalsIgnoreCase(nomObjecte)) {
                return o;
            }
        }
        return null;
    }

    public List<Objecte> getObjectes() {
        return objectes;
    }

    public String getNom() {
        return nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public boolean isVisitada() {
        return visitada;
    }

    public void marcarVisitada() {
        this.visitada = true;
    }

    /**
     * Text que es mostra quan el jugador entra a la zona:
     * descripció + sortides possibles + objectes visibles.
     */
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("== ").append(nom).append(" ==\n");
        sb.append(descripcio).append("\n");
        if (!objectes.isEmpty()) {
            sb.append("Objectes a la vista: ");
            for (Objecte o : objectes) {
                sb.append(o.getNom()).append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("\n");
        }
        if (!sortides.isEmpty()) {
            sb.append("Sortides: ").append(String.join(", ", sortides.keySet()));
        }
        return sb.toString();
    }
}
