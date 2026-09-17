import java.util.Map;
import java.util.Scanner;

/**
 * Motor principal del joc. Segueix l'esquema bàsic del full de projecte:
 * 1. Mostrar zona actual
 * 2. Esperar ordre del jugador
 * 3. Avaluar l'ordre
 * 4-7. Executar canvi de zona / acció / dir que no es pot fer
 * 8. Repetir fins que es doni la condició de final de joc
 */
public class Joc {

    private Map<String, Zona> zones;
    private Jugador jugador;
    private IHall iHall;
    private Scanner scanner;
    private boolean partidaAcabada;

    public Joc() {

    }

}
