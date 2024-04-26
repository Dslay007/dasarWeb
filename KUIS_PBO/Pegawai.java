public class Pegawai {
    protected String noIndukPegawai;
    protected String nama;
    protected int gaji;

    public void setNoIndukPegawai(String noIndukPegawai) {
        this.noIndukPegawai = noIndukPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNoIndukPegawai() {
        return noIndukPegawai;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    public void tampilDataPegawai() {
        System.out.println("No Induk : " + noIndukPegawai);
        System.out.println("Nama " + nama);
        System.out.println("Gaji Pokok : " + gaji);
    }
}
