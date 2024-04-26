public class Manajer extends Pegawai {
    private int tunjanganJabatan;

    public void setTunjanganJabatan(int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void tampilDataManajer() {
        tampilDataPegawai();
        System.out.println("Tunjangan Jabatan : " + tunjanganJabatan);
    }
}
