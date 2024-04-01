package KUIS_PBO;

public class BangunKerucut {

    private double r; 
    private double t; 
    private double s; 


    public BangunKerucut(double r, double t, double s) {
        this.r = r;
        this.t = t;
        this.s = s;
    }


    public double hitungVolume() {
        return (1.0/3.0) * Math.PI * r * r * t;
    }

    
    public double hitungLuasPermukaan() {
        return Math.PI * r * (s + r);
    }

    public static void main(String[] args) {

        //memasukkan angkanya disini
        BangunKerucut bangun = new BangunKerucut(5.0, 8.0, 10.0);

     
        double volume = bangun.hitungVolume();
        System.out.println("Volume bangun ruang: " + volume);

    
        double luasPermukaan = bangun.hitungLuasPermukaan();
        System.out.println("Luas permukaan bangun ruang: " + luasPermukaan);
    }
}
