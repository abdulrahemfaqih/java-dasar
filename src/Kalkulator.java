import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) throws Exception {
        float hasil;
        // input user
        Scanner input = new Scanner(System.in);
        System.out.print("bilangan pertama = ");
        float bilanganPertama = input.nextFloat();
        System.out.print("operator = ");
        char operator = input.next().charAt(0);
        System.out.print("bilangan kedua = ");
        float bilanganKedua = input.nextFloat();

        System.out.println("input user = " + bilanganPertama + " " + operator + " " + bilanganKedua);

        if (operator == '+') {
            hasil = bilanganPertama + bilanganKedua;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-') {
            hasil = bilanganPertama - bilanganKedua;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*') {
            hasil = bilanganPertama * bilanganKedua;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            if (bilanganKedua == 0) {
                System.out.println("pembagi 0 akan menghasilkan tak hingga");
            } else {
                hasil = bilanganPertama / bilanganKedua;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }
        input.close();
    }
}
