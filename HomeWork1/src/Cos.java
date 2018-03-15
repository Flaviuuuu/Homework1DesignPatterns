import java.util.ArrayList;

public class Cos {

    protected float greutate;
    protected float total;

    private ArrayList<Produs> produse = new ArrayList<Produs>();

    public Cos() {
    }

    public void adaugaProdus(Produs produs) {
        if (produse.contains(produs)) {
            produs.cantitate++;
        } else {
            this.produse.add(produs);
            produs.cantitate++;
        }
        this.greutate += produs.greutate;
        this.total += produs.pret;
    }

    public void afiseazaProduse() {
        System.out.println("Produse adaugate in cos: ");
        for (Produs produs : this.produse) {
            System.out.println("Produs: " + produs.getNume() + "; cantitate: " + produs.cantitate + "; Pret: "
                    + (produs.pret * produs.cantitate) + " RON");
        }

        System.out.println("Transport: " + this.costTransport() + " RON");
        System.out.println("Total: " + this.costTotal() + " RON");
    }

    public float costTotal() {
        float pretTotal = this.total + this.costTransport();

        return pretTotal;
    }

    public float costTransport() {
        float pretTransport;
        if (this.greutate <= 1) {
            pretTransport = 12;
        } else {
            pretTransport = 12 + (Math.round(this.greutate - 1)) * 2;
        }
        return pretTransport;
    }

    public void checkout() {
        System.out.println("Comanda din valoare de: " + this.costTotal() + " RON (din care " + this.total
                + " RON valoare produse si " + this.costTransport()
                + " RON valoare transport) a fost expediata. Va multumim!");
    }
}
