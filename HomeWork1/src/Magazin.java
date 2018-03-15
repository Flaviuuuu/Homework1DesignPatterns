import java.util.ArrayList;

public class Magazin {

    private ArrayList<Produs> produse = new ArrayList<Produs>();

    public Magazin() {

    }

    public void adaugaProdus(Produs produs) {
        this.produse.add(produs);

        System.out.println("Produs adaugat" + produs.getNume());
    }

    public void stergeProdus(Produs produs) {
        this.produse.remove(produs);

        System.out.println("Produs sters" + produs.getNume());
    }

    public void afiseazaProduse() {
        for (Produs produs : this.produse) {
            System.out.println("Idul Produslui: " + produs.getId() + "; Nume:" + produs.getNume() + "; Cantitate: "
                    + produs.getCantitate() + "; Pret: " + produs.getPret() + " RON");
        }
    }

    public Produs afiseazaProdus(int Id) {
        Produs produs1 = new Produs();
        for(Produs produs : produse) {
            if(produs.getId() == Id) {
                produs1 = produs;
            }
        }
        return produs1;
    }

}
