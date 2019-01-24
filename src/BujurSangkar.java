public class BujurSangkar {
   public int sisi = 7;
   public int keliling;


public void keliling(){
    keliling = 2*(sisi+sisi);
    System.out.println("Keliling Bujursangkar = "+keliling);

    }
    public static void main (String[]args){
        BujurSangkar bu = new BujurSangkar();
        bu.keliling();
    }
}