public class MataKuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah08 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Menambahkan method tambahData() dan method cetakInfo() tuk menjawab pertanyaan nomor 2 dan 3 Percobaan 3
    // Method tambahData()
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method cetakInfo
    public void cetakInfo() {
        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
}
