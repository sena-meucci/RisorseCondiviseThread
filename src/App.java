/**
 * Questo esercizio mostra la condivisione di una risorsa (Salvadanaio) tra Thread.
 * Ogni Thread inserisce per TOT volte una moneta nel salvadanaio.
 * Al termine dell'esecuzione dei Thread viene stampato quanti soldi ci sono nel salvadanaio.
 * Purtroppo qualcosa non va! Cosa?
 * PROBLEMA RISOLTO CON UN SEMAFORO! --> regola l'accesso in MUTUA ESCLUSIONE
 * @author Giuseppe
 *  @version 1.0
 */
public class App {
    
    public static void main(String[] args) throws Exception {
        
        Salvadanaio piggybank = new Salvadanaio();
        Semaforo semaforo=new Semaforo(1); //SEMAFORO CREATO E IMPOSTATO A VERDE
        Persona th1= new Persona("ciccio", piggybank, semaforo);
        Persona th2=new Persona("gamer",piggybank,semaforo);
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Il salvadanaio contiene " + piggybank.getSoldi()+" euro");
     
    }
}
