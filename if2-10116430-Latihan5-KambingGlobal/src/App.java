/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {

    int jumlahKambing = 88;

    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing " + jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah di tambah:  " + jumlahKambing);
    }

    public static void main(String[] args) throws Exception {
        App kambingSusu = new App();

        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();

        // Menambah satu kambing
        kambingSusu.tambahKambing();

        // menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
