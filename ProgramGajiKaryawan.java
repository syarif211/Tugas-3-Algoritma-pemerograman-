import java.util.Scanner;

public class ProgramGajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array Gaji Pokok berdasarkan Golongan [0: A, 1: B, 2: C]
        double[] arrayGaji = {5000000, 6500000, 9500000};

        // Array Persentase Lembur [%]
        double[] arrayLembur = {30, 32, 34, 36, 38};

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = input.next().toUpperCase();

        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double persenLembur = 0;
        boolean valid = true;

        // 1. Mengambil Gaji dari Array berdasarkan Golongan menggunakan IF
        if (golongan.equals("A")) {
            gajiPokok = arrayGaji[0];
        } else if (golongan.equals("B")) {
            gajiPokok = arrayGaji[1];
        } else if (golongan.equals("C")) {
            gajiPokok = arrayGaji[2];
        } else {
            System.out.println("Golongan tidak valid!");
            valid = false;
        }

        if (valid) {
            // 2. Menentukan persentase lembur dari Array berdasarkan Jam Lembur menggunakan IF
            if (jamLembur == 1) {
                persenLembur = arrayLembur[0];
            } else if (jamLembur == 2) {
                persenLembur = arrayLembur[1];
            } else if (jamLembur == 3) {
                persenLembur = arrayLembur[2];
            } else if (jamLembur == 4) {
                persenLembur = arrayLembur[3];
            } else if (jamLembur >= 5) {
                persenLembur = arrayLembur[4];
            } else {
                persenLembur = 0; // Jika tidak lembur (0 jam)
            }

            // 3. Perhitungan menggunakan Operator Matematika
            double gajiLembur = (persenLembur / 100) * gajiPokok;
            double totalGaji = gajiPokok + gajiLembur;

            // Output Hasil Perhitungan
            System.out.println("\n=================================");
            System.out.println("       RINCIAN GAJI KARYAWAN     ");
            System.out.println("=================================");
            System.out.println("Golongan Karyawan : " + golongan);
            System.out.println("Gaji Pokok        : Rp " + (long) gajiPokok);
            System.out.println("Lembur            : " + jamLembur + " Jam (" + (int) persenLembur + "%)");
            System.out.println("Gaji Lembur       : Rp " + (long) gajiLembur);
            System.out.println("---------------------------------");
            System.out.println("Total Gaji        : Rp " + (long) totalGaji);
            System.out.println("=================================");
        }

        input.close();
    }
}