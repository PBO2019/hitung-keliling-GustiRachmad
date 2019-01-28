public class Lingkaran {
    private double phi ;
    private int r ;
    private double keliling;

    public void Hitungkeliling(){
    this.keliling= 2*phi*r;
    }
    public double getKeliling(){
        return keliling;
    }
    public void setPhi(double phi){
        this.phi =phi;
    }
    public void setR(int r){
        this.r = r;
    }
}
