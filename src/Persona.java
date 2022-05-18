/**
 * La classe Persona e' un Thread che provera' a inserire per TOT volte una moneta nel salvadanaio
 * @author Giuseppe
 * 
 */
public class Persona extends Thread{
    String nome;
    Salvadanaio s;

    public Persona(String nome, Salvadanaio s) {
        this.nome = nome;
        this.s = s;
    }

    /**
     * Il thread inserirà per 3000 volte una moneta di 1€ nel salvadanaio
     */
@Override
    public void run(){

        for (int i=1; i<3000; i++) {
         
            s.inserisciMoneta(1);
            
             }
    }
}
