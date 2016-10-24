package firma.bestellwesen;
import firma.stammdaten.Lieferant;

/**
 * Ein Artikel aus dem Angebot der Firma.
 */
public class Artikel {

    /** Name des Artikels. */
    private String biest;
    
    /** Preis des Artikels. */
    private int preis;
    
    /** Lieferanten des Artikels. */
    private Lieferant[] lieferanten;
}
