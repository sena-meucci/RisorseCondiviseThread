/**
 * Questo esercizio mostra la condivisione di una risorsa (Salvadanaio) tra Thread.
 * Ogni Thread inserisce per TOT volte una moneta nel salvadanaio.
 * Al termine dell'esecuzione dei Thread viene stampato quanti soldi ci sono nel salvadanaio.
 * Purtroppo qualcosa non va! Cosa?
 * @author Giuseppe
 *  @version 1.0
 */
public class App {
    
    public static void main(String[] args) throws Exception {
        
        Salvadanaio s = new Salvadanaio();
        Persona th1= new Persona("ciccio", s);
        Persona th2=new Persona("gamer",s);
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Il salvadanaio contiene " + s.getSoldi()+" euro");
     
    }
}
