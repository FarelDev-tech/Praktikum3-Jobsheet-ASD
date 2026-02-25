import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy, jenisKelaminInput;
        Boolean jenisKelamin;
        int usia, jumlahDosen;

        System.out.print("Masukkan jumlah dosen: ");
        jumlahDosen = sc.nextInt();
        sc.nextLine(); // membersihkan buffer agar tidak nyangkut

        // Membuat array of Dosen08 dengan panjang sesuai jumlahDosen yang dimasukkan oleh administratif :3
        Dosen08[] arrayOfDosen = new Dosen08[jumlahDosen];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            // Jeniskelamin diinput Pria atau Wanita nanti langsung jadi true atau false
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            jenisKelaminInput = sc.nextLine();
            jenisKelamin = jenisKelaminInput.equalsIgnoreCase("Pria");
            System.out.print("Usia: ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        // menampilkan data dosen menggunakan foreach
        // for (Dosen08 dosen : arrayOfDosen) {
        //     dosen.cetakInfo();
        //     System.out.println("-----------------------------");
        // }

        // Membuat objek dari class DataDosen08 untuk memanggil method-methodnyaa
        DataDosen08 dataDosen = new DataDosen08(); // Inisialisasi objek dataDosen dari class DataDosen08

        // Memanggil method-method dari class
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaPerJenisKelaminDosen(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
