public class Main {
    public static void main (String [] args){
        System.out.println("Hello World!");
        Lingkaran bunder = new Lingkaran();
        BujurSangkar kotak = new BujurSangkar();


        bunder.setR(10);
        bunder.setPhi(3.14);
        bunder.Hitungkeliling();
        System.out.println("jadi Keliling Lingkaran adalah"+bunder.getKeliling());

        kotak.setSisi(7);
        kotak.Hitungluas();
        System.out.println("Jadi Luas Bujur sangkar adalah "+ kotak.getLuas());
    }
}
