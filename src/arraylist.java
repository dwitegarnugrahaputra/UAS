import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kapasitasLantai1 = 2000;
        int kapasitasLantai2 = 1800;
        int kapasitasLantai3 = 1500;

        ArrayList<Integer> lantai1 = new ArrayList<>();
        ArrayList<Integer> lantai2 = new ArrayList<>();
        ArrayList<Integer> lantai3 = new ArrayList<>();

        System.out.println("Selamat datang di Aplikasi Parkir Apartemen");

        while (true) {
            System.out.print("Masukkan kapasitas mesin (cc): ");
            int kapasitasMesin = scanner.nextInt();

            if (kapasitasMesin >= 1000 && kapasitasMesin <= 1200) {
                System.out.println("Mobil ditempatkan di Lantai 3");
                lantai3.add(kapasitasMesin);
            } else if (kapasitasMesin >= 1500 && kapasitasMesin <= 2000) {
                System.out.println("Mobil ditempatkan di Lantai 2");
                lantai2.add(kapasitasMesin);
            } else if (kapasitasMesin >= 2500) {
                System.out.println("Mobil ditempatkan di Lantai 1");
                lantai1.add(kapasitasMesin);
            } else {
                System.out.println("Kendaraan tidak memenuhi kriteria. Mohon masukkan kapasitas mesin yang sesuai.");
            }

            if (totalBeban(lantai1) > kapasitasLantai1 || totalBeban(lantai2) > kapasitasLantai2 || totalBeban(lantai3) > kapasitasLantai3) {
                System.out.println("Kapasitas lantai penuh. Mohon masuk ke lantai lain.");
                break;
            }

            System.out.println("Kendaraan di Lantai 1: " + lantai1);
            System.out.println("Kendaraan di Lantai 2: " + lantai2);
            System.out.println("Kendaraan di Lantai 3: " + lantai3);

            System.out.print("Apakah ada kendaraan lain yang akan masuk? (ya/tidak): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }
        }

        scanner.close();
    }

    private static int totalBeban(ArrayList<Integer> lantai) {
        int total = 0;
        for (int kapasitasMesin : lantai) {
            total += kapasitasMesin;
        }
        return total;
    }
}
