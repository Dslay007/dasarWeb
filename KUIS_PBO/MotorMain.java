package KUIS_PBO;


public class MotorMain {
    public static void main(String[] args) {

        SepedaMotor sepeda1 = new SepedaMotor("Kawasaki Ninja", MerkMesin.KAWASAKI);
        sepeda1.printInfo();

        System.out.println();

        SepedaMotor sepeda2 = new SepedaMotor("Suzuki Hayabusa", MerkMesin.SUZUKI);
        sepeda2.printInfo();

        System.out.println();

        SepedaMotor sepeda3 = new SepedaMotor("BMW S1000RR", MerkMesin.BMW);
        sepeda3.printInfo();
    }
}

