import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data pegawai
        System.out.println("Masukkan No Induk Pegawai: ");
        String noIndukPegawai = scanner.nextLine();
        System.out.println("Masukkan Nama Pegawai: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Gaji Pokok: ");
        int gajiPokok = scanner.nextInt();

        // Input data manajer
        System.out.println("Masukkan Tunjangan Jabatan : ");
        int tunjanganJabatan = scanner.nextInt();

        // Input data pemegang saham
        System.out.println("Masukkan Jumlah Saham: ");
        int jumSaham = scanner.nextInt();
        System.out.println("Masukkan Deviden: ");
        int deviden = scanner.nextInt();

        // Menghitung total gaji pertama
        int totalGajiPertama = gajiPokok + tunjanganJabatan;

        // Membuat objek dari class yang telah dibuat
        Programmer programmer = new Programmer();
        Manajer manajer = new Manajer();
        PemegangSaham pemegangSaham = new PemegangSaham();

        // Set data pegawai
        programmer.setNoIndukPegawai(noIndukPegawai);
        programmer.setNama(nama);
        programmer.setGaji(gajiPokok);
        // Set data manajer
        manajer.setTunjanganJabatan(tunjanganJabatan);
        // Set data pemegang saham
        pemegangSaham.setJumSaham(jumSaham);
        pemegangSaham.setDeviden(deviden);

        // Menampilkan data
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("No Induk : " + noIndukPegawai);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan Jabatan : " + tunjanganJabatan);
        System.out.println("Total Gaji : " + totalGajiPertama);
        System.out.println("Deviden: " + deviden);
        System.out.println("Jumlah Saham: " + jumSaham);
        System.out.println("Total Gaji : " + (totalGajiPertama + deviden));
        System.out.println("======================================");
        System.out.println("======================================");
    }
}
