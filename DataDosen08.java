public class DataDosen08 {
    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        // Menampilkan data semua dosen menggunakan foreach
        for (Dosen08 dosen : arrayOfDosen) {
            dosen.cetakInfo();
            System.out.println("-----------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        // Menghitung jumlah dosen berdasarkan jenis kelamin
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
        System.out.println("-----------------------------");
    }

    public void rerataUsiaDosen(Dosen08[] arrayOfDosen) {
        int totalUsia = 0;
        double rerataUsia;

        // Menjumlahkan usia semua dosen
        for (Dosen08 dosen : arrayOfDosen) {
            totalUsia += dosen.usia;
        }

        // Menghitung rerata usia dosen
        if (arrayOfDosen.length > 0) {
            rerataUsia = (double) totalUsia / arrayOfDosen.length;
            System.out.println("Rerata Usia Dosen: " + rerataUsia);
        } else {
            System.out.println("Tidak ada data dosen.");
        }
        System.out.println("-----------------------------");
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        // Mengecek apakah array dari dosen itu kosong
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        // Mencari dosen paling tua
        Dosen08 dosenTua = arrayOfDosen[0]; // Inisialisasi dengan dosen pertama sebagai yang tertua
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        dosenTua.cetakInfo();
        System.out.println("-----------------------------");
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        // Mencari dosen paling muda
        Dosen08 dosenMuda = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        dosenMuda.cetakInfo();
        System.out.println("-----------------------------");
    }
}
