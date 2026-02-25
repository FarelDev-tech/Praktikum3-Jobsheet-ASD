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

    public void rerataUsiaPerJenisKelaminDosen(Dosen08[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        double rerataUsiaPria, rerataUsiaWanita;

        // Menjumlahkan usia semua dosen
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        // Menghitung rerata usia dosen pria
        if (jumlahPria > 0) {
            rerataUsiaPria = (double) totalUsiaPria / jumlahPria;
            System.out.println("Rerata Usia Dosen Pria: " + rerataUsiaPria);
        } else {
            System.out.println("Tidak ada data dosen pria.");
        }

        // Menghitung rerata usia dosen wanita
        if (jumlahWanita > 0) {
            rerataUsiaWanita = (double) totalUsiaWanita / jumlahWanita;
            System.out.println("Rerata Usia Dosen Wanita: " + rerataUsiaWanita);
        } else {
            System.out.println("Tidak ada data dosen wanita.");
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
