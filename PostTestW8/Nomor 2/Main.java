class Orang {
    Orang() {
        System.out.println("Orang dibuat");
    }
}

class Dosen extends Orang {
    Dosen() {
        super();  // Memanggil constructor Orang
        System.out.println("Dosen dibuat");
    }
}

public class Main {
    public static void main(String[] args) {
        Dosen d = new Dosen();
    }
}

