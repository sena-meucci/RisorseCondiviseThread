/**
 * La classe Semaforo gestisce la sincronizzazione per l'accesso a risorse condivise tra thread 
 * VALORE = 0 --> ROSSO
 * VALORE > 0 --> VERDE
 */
public class Semaforo {
    private int valore;
    
    public Semaforo(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

 public synchronized void P(){
 while (valore==0){  //Fin quando il semoforo è ROSSO
    try {
        System.out.println(Thread.currentThread().getName()+ "in attesa");
        //Thread.currentThread() -> restituisce l'oggetto thread che in quel momento esegue l'istruzione
        wait();
    } catch (Exception e) {
        // TODO: handle exception
    } 
}
    valore=0; // La risorsa ora è libera, la uso e metto il ROSSO per gli altri thread
}
      


   

 public synchronized void V(){
    valore=1; // RIPORTO IL SEMAFORO A VERDE
    notify(); // Risveglio eventuali thread in attesa 
  }

}