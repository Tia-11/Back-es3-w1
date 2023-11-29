package Entities;

public class Sim {
    public long numeroTelefono;
    public int credito;

    public Sim(long numeroTelefono) {
        if (String.valueOf(numeroTelefono).length() == 9) {
            this.numeroTelefono = numeroTelefono;
            this.credito = 0;
        } else {
            System.out.println("Errore: Il numero di telefono deve essere un intero di 10 cifre.");
        }
    }

    public void stampaDatiSim(){
        System.out.println("Il numero di telefono è: " + numeroTelefono);
        System.out.println("Il tuo credito è: " + credito);

    }
}
