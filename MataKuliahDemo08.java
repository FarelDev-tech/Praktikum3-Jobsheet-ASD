import java.util.Scanner;

public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, jumlahMataKuliah;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMataKuliah = sc.nextInt(); 
        sc.nextLine(); // membersihkan buffer agar tidak nyangkut

        // Membuat array of MataKuliah08 dengan panjang sesuai jumlahMataKuliah yang dimasukkan oleh user
        MataKuliah08[] arrayOfMataKuliah = new MataKuliah08[jumlahMataKuliah];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMataKuliah[i] = new MataKuliah08(kode, nama, sks, jumlahJam);
        }

        // Permisalan menambahkan sendiri method tambahData() untuk mengubah data mata kuliah ke-2
        arrayOfMataKuliah[1].tambahData("123", "MATEMATIKA", 3, 2);

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}
