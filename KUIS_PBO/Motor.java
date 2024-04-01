package KUIS_PBO;

enum MerkMesin {
    KAWASAKI,
    SUZUKI,
    BMW
}

class Mesin {
    private MerkMesin merk;

    public Mesin(MerkMesin merk) {
        this.merk = merk;
    }

    public void tambahKecepatan() {
        switch (merk) {
            case KAWASAKI:
                System.out.println("Tambah Kecepatan : 15 km/jam");
                break;
            case SUZUKI:
                System.out.println("Tambah Kecepatan : 25 km/jam");
                break;
            case BMW:
                System.out.println("Tambah Kecepatan : 35 km/jam");
                break;
            default:
                System.out.println("Merk mesin tidak valid");
        }
    }

    public void kurangKecepatan() {
        switch (merk) {
            case KAWASAKI:
                System.out.println("Kurangi kecepatan : 10 km/jam");
                break;
            case SUZUKI:
                System.out.println("Kurangi kecepatan : 15 km/jam");
                break;
            case BMW:
                System.out.println("Kurangi kecepatan : 20 km/jam");
                break;
            default:
                System.out.println("Merk mesin tidak valid");
        }
    }
}

class SepedaMotor {
    private String merkSepedaMotor;
    private MerkMesin merkMesin;
    private Mesin mesin;

    public SepedaMotor(String merkSepedaMotor, MerkMesin merkMesin) {
        this.merkSepedaMotor = merkSepedaMotor;
        this.merkMesin = merkMesin;
        this.mesin = new Mesin(merkMesin);
    }

    public void printInfo() {
        System.out.println("Merk sepeda motor : " + merkSepedaMotor);
        System.out.println("Merk mesin : " + merkMesin);
        mesin.tambahKecepatan();
        mesin.kurangKecepatan();
    }
}

