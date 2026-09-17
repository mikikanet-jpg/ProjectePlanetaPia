import java.util.Random;

/**
 * iHall, l'ordinador de la nau. Ajuda en Bond però últimament "està un pel
 * transposat": a vegades diu la veritat i a vegades no (p. ex. amb la llanterna,
 * 50% de probabilitat de dir la ubicació correcta).
 */
public class IHall extends Personatge {

    private Random random;

    public IHall(Zona zonaActual) {
        super("iHall", zonaActual);
        this.random = new Random();
    }

    /**
     * Simula la resposta d'iHall quan se li demana la ubicació de la llanterna:
     * 50% de vegades correcta, 50% de vegades una bestiesa.
     */
    public String onLlanterna(String ubicacioReal) {
        // quan es tingui el mapa complet, aquí caldrà retornar
        // la ubicació real o una zona inventada, a l'atzar (50/50).
        if (random.nextBoolean()) {
            return "iHall diu: la llanterna està a " + ubicacioReal + ".";
        }
        return "iHall diu: la llanterna està... a la sala de màquines! (pot no ser cert)";
    }

    @Override
    public String parlar(String frase) {
        // reaccionar a paraules clau com "llanterna", "malien", "tarja"...
        return "iHall respon a la teva pregunta sobre: " + frase;
    }
}
