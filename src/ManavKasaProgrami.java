import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
    double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, armut, elma, domates, muz, patlican, total;
    armutKg = 2.14;
    elmaKg = 3.67;
    domatesKg = 1.11;
    muzKg = 0.95;
    patlicanKg = 5.00;

    Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? :" );
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo?:");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo?:");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo?:");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo?:");
        patlican = input.nextDouble();

        total = (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg);
        System.out.println("Toplam Tutar:" + total);
        


    }
}
