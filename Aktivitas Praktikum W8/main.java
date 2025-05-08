class kendaraan {
    String merk = "Toyota";
    
    kendaraan(){
        System.out.println("Ini Constructor Parent");
    }

    void jalan (){
        System.out.println("Kendaraan berjalan");
}

class Mobil extends kendaraan {
    string merk = "BMW"(){
        super();
        System.out.println("Ini constructor child");
    }

    void printInfo(){
        System.out.println("Merk mobil child " + merk);
        System.out.println("Merk mobil parent" + super.merk);
        jalan();
    }

    void klakson(String merk) {
        System.out.println("Mobil" + super.merk + "klakson");
    }
}

public class main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        // jazz.jalan();
        jazz.printInfo();
        jazz.klakson("Toyota");
        System.out.println(jazz.merk);
    }
}
