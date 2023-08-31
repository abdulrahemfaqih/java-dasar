import java.util.Scanner;

public class LatihanLooping {
    public static void main(String[] args) {
        sumRentang(1, 10);
        deretFibbonaci();
    }

    static void sumRentang(int angkaAwal, int angkaAkhir) {
        int total = 0;
        System.out.print("rentang = ");
        for (int i = angkaAwal; i <= angkaAkhir; i++) {
            System.out.print(i + " ");
            total += i;
        }
        System.out.println("=> total = " + total);
    }

    static void deretFibbonaci() {
        int f_n, f_n_1, f_n_2, n;

        Scanner input = new Scanner(System.in);
        System.out.print("mengambil nilai fibbonaci ke - ");
        n = input.nextInt();
        input.close();
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("nilai ke - " + i + " adalah = " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

    }
}
