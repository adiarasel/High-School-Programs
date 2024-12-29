public class smartphone extends computer{
    String brand;
    public smartphone(){
        size_in = 14;
        CPU_quality = "fair";
        color = "black";
        brand = "Dell";
    }
    public smartphone(int size, String qual, String col, String bra){
        size_in = size;
        CPU_quality = qual;
        color = col;
        brand = bra;
    }
    public String getBrand(smartphone b){
        return b.brand;
    }
}
