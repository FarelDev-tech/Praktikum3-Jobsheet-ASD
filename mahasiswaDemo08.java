public class mahasiswaDemo08 {
    public static void main(String[] args) {
        mahasiswa08[] arrayOfMahasiswa = new mahasiswa08[3];
        arrayOfMahasiswa[0] = new mahasiswa08();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new mahasiswa08();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new mahasiswa08();
        arrayOfMahasiswa[2].nim = "254107060069";
        arrayOfMahasiswa[2].nama = "FAREL MAULANA FIRDAUS";
        arrayOfMahasiswa[2].kelas = "SIB-1A";
        arrayOfMahasiswa[2].ipk = (float) 3.79;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("NIM: " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama: " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK: " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
    }
}
