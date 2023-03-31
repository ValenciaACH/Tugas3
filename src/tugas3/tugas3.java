import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tugas3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double totalNilai = 0;
        int totalSKS = 0;
        double IPS;

        try {
            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMataKuliah = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= jumlahMataKuliah; i++) {
                System.out.println("Mata kuliah ke-" + i + ":");
                System.out.print("Masukkan nilai (A/B/C/D/E): ");
                String nilai = reader.readLine().toUpperCase();

                double bobotNilai = 0;
                int sks = 0;

                switch (nilai) {
                    case "A":
                        bobotNilai = 4.0;
                        break;
                    case "B":
                        bobotNilai = 3.0;
                        break;
                    case "C":
                        bobotNilai = 2.0;
                        break;
                    case "D":
                        bobotNilai = 1.0;
                        break;
                    case "E":
                        bobotNilai = 0.0;
                        break;
                    default:
                        System.out.println("Nilai yang dimasukkan tidak valid!");
                        i--;
                        continue;
                }

                System.out.print("Masukkan jumlah SKS: ");
                sks = Integer.parseInt(reader.readLine());

                totalNilai += bobotNilai * sks;
                totalSKS += sks;
            }

            IPS = totalNilai / totalSKS;

            System.out.println("IPS Anda pada semester 1 lalu adalah: " + IPS);

            if (IPS >= 3.5) {
                System.out.println("SKS maksimal yang dapat dicapai adalah 24 SKS");
            } else if (IPS >= 3.0) {
                System.out.println("SKS maksimal yang dapat dicapai adalah 20 SKS");
            } else if (IPS >= 2.5) {
                System.out.println("SKS maksimal yang dapat dicapai adalah 16 SKS");
            } else if (IPS >= 2.0) {
                System.out.println("SKS maksimal yang dapat dicapai adalah 12 SKS");
            } else {
                System.out.println("SKS maksimal yang dapat dicapai adalah 8 SKS");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
