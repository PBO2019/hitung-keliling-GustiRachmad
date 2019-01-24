public class Lingkaran {
        public double phi = 3.14;
        public int r = 6;
        double keliling;

    public void keliling(){
    keliling = 2*phi*r;
    System.out.println("Keliling Lingkaran ="+ keliling);
    }
    public static void main (String [] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.keliling();
    }
    }
