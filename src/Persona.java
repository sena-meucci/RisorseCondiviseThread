/**
 * La classe Persona e' un Thread che provera' a inserire per TOT volte una moneta nel salvadanaio
 * @author Giuseppe
 * 
 */
public class Persona extends Thread{
    private String nome;
    private Salvadanaio salva;
    private Semaforo s;

  
/**
 * 
 * @param nome Il nome del Thread che inserirà le monete
 * @param salva Il salvadanaio condiviso
 * @param s il semaforo condiviso con gli altri thread per sincronizzare le operazioni sul salvadanaio (MUTUA ESCLUSIONE)
 */
    public Persona(String nome, Salvadanaio salva, Semaforo s) {
        this.nome = nome;
        this.salva = salva;
        this.s = s;
    }



    /**
     * Il thread inserirà per 20 volte una moneta di 1€ nel salvadanaio
     * Controllare il semaforo prima di fare l'operazione, in caso di ROSSO allora attendere
     */ 

@Override
    public void run(){

        for (int i=1; i<=20; i++) {

            s.P();   //PRIMA DI INSERIRE VERIFICO IL SEMAFORO
            salva.inserisciMoneta(1);
            System.out.println(nome+ " ha inserito moneta");
            s.V();
            /*APPENA IL THREAD FINISCE DI USARE LA RISORSA, RICHIAMA LA PRIMITIVA V() DEL SEMAFORO
            RIPORTA IL SEMAFORO A VERDE, E SVEGLIA EVENTUALI THREAD CHE SONO IN CODA */
         }
             
    }
}
