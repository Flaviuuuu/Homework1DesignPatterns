public class Produs {

    protected int id;
    protected String nume;
    protected String unitate;
    protected float pret;
    protected double greutate;
    protected double cantitate;

    public Produs() {

    }

    public Produs(int id, String nume, String unitate, float pret, double greutate, double cantitate) {
        this.id = id;
        this.nume = nume;
        this.unitate = unitate;
        this.pret = pret;
        this.greutate = greutate;
        this.cantitate = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getUnitate() {
        return unitate;
    }

    public void setUnitate(String unitate) {
        this.unitate = unitate;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }

}
