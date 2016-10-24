package tpe.oo.constructor;

/**
 * Untoter aus der Horde.
 */
public class Untoter extends Wesen {



    /** Standardmäßige Stärke der Fähigkeit zur Unterwasseratmung. */
    public static final int STANDARD_UNTERWASSERATMUNG = 10;
    
    /** Fähigkeit zur Atmung unter Wasser. */
    private int unterwasseratmung;

    public Untoter(String name, int uAtmung) {
        super(name);
        this.unterwasseratmung = uAtmung;
    }
    
    public Untoter(String name){
        this(name, STANDARD_UNTERWASSERATMUNG);
    }
    
    /**
     * Fähigkeit zur Unterwasseratmnung.
     * 
     * @return the Stärke der Fähigkeit.
     */
    public int getUnterwasseratmung() {
        return unterwasseratmung;
    }
}
