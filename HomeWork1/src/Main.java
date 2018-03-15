import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Magazin magazin = new Magazin();

        Produs cafeaBobite = new Produs(1, "cafea boabe 250g", "kg", 20, 0.25, 0);
        Produs cafeaBobicele = new Produs(2, "cafea boabe 500g", "kg", 35, 0.5, 0);
        Produs cafeaBoabe = new Produs(3, "cafea boabe 1kg", "kg", 50, 1, 0);
        Produs siropCaramel = new Produs(4, "Sirop caramel", "buc", 15, 0.3, 0);
        Produs canaCafea = new Produs(5, "Cana", "buc", 15, 0.3, 0);
        Produs baxCafea = new Produs(6, "Bax Cafea", "buc", 600, 5, 0);


        magazin.adaugaProdus(cafeaBobite);
        magazin.adaugaProdus(cafeaBobicele);
        magazin.adaugaProdus(cafeaBoabe);
        magazin.adaugaProdus(siropCaramel);
        magazin.adaugaProdus(canaCafea);
        magazin.adaugaProdus(baxCafea);


        Cos cosul = new Cos();


        citesteComanda(magazin, cosul);

    }

    static Scanner in = new Scanner(System.in) ;

    public static void citesteComanda(Magazin magazin, Cos cos) {

        int command = in.nextInt();

        switch (command) {

            case 1:
                magazin.afiseazaProduse();
                citesteComanda(magazin, cos);
                break;

            case 2:
                System.out.println("Scrie id-ul produsului: ");
                int id = in.nextInt();
                System.out.println("Produsul a fost adaugat in cos, adauga alt produs sau tasteaza alta comanda");
                cos.adaugaProdus(magazin.afiseazaProdus(id));
                citesteComanda(magazin, cos);
                break;

            case 3:
                cos.afiseazaProduse();
                citesteComanda(magazin, cos);
                break;

            case 4:
                cos.checkout();
                break;

            default:
                System.out.println("Comanda invalida");
                citesteComanda(magazin, cos);
                break;
            }
        }

    }



