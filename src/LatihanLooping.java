
public class LatihanLooping {
    public static void main(String[] args) {
        sumRentang(1, 10);
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
}
