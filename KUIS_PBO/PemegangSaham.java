public class PemegangSaham {
    private int deviden;
    private int jumSaham;

    public void setDeviden(int deviden) {
        this.deviden = deviden;
    }

    public void setJumSaham(int jumSaham) {
        this.jumSaham = jumSaham;
    }

    public int getDeviden() {
        return deviden;
    }

    public int getJumSaham() {
        return jumSaham;
    }

    public void tampilDataPemegangSaham() {
        System.out.println("Deviden: " + deviden);
    }
}
