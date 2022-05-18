/**
 * La classe Salvadanaio consente di custodire monete. 
 * I metodi inserisciMonete e prendiMoneta permettono l'inserimento/prelievo di soldi dal salvadanaio
 * @author Giuseppe
 */
public class Salvadanaio {
    /**
     * Quantità di soldi espressi in euro contenuti nel salvadanaio
     */
    private float soldi;


    public Salvadanaio(float soldi) {
        this.soldi=soldi;
    }

    public Salvadanaio() {
        this.soldi=0;
    }


    public float getSoldi() {
        return soldi;
    }


    public void setSoldi(float soldi) {
        this.soldi = soldi;
    }


/**
 * Metodo che inserisce una moneta di un determinato valore. L'attributo soldi verrà incrementato.
 * Il synchronized consente l’esecuzione del codice ad un solo thread alla volta (MUTUA ESCLUSIONE) 
 * @param valoreMoneta valore della moneta che si introduce nel salvadanaio
 */
    public synchronized void inserisciMoneta(float valoreMoneta){

        this.soldi+=valoreMoneta;
    }

    /**
     * Metodo che preleva una moneta di un determinato valore. L'attributo soldi verrà decrementato.
     * Il synchronized consente l’esecuzione del codice ad un solo thread alla volta (MUTUA ESCLUSIONE) 
     * @param valoreMoneta valore della moneta che si preleva dal salvadanaio
     */
    public synchronized void prendiMoneta(float valoreMoneta){

        this.soldi-=valoreMoneta;

    }
}
