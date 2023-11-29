import Entities.Rettangolo;
import Entities.Sim;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Rettangolo uno = new Rettangolo(10,44);
        Rettangolo due = new Rettangolo(4,17);

        Sim prima = new Sim(342023822);

        uno.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(uno,due);

        prima.stampaDatiSim();

    }
}