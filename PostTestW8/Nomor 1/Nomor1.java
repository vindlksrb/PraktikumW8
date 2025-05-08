package PostTestW8;

class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama di subclass: " + nama);
        System.out.println("Nama di superclass: " + super.nama);
    }
}

public class Nomor1 {
    public static void main(String[] args) {
        GedungSekolah gs = new GedungSekolah();
        gs.tampilkanInfo();
    }
}

