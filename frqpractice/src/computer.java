public class computer extends abstractentity {
    int size_in;
    String CPU_quality;
    String color;
    public computer(){
        size_in = 14;
        CPU_quality = "fair";
        color = "white";
    }
    public computer(int size, String qual, String col){
        size_in = size;
        CPU_quality = qual;
        color = col;
    }
    public boolean newcomp(computer a){
        if(a.CPU_quality == "very good") return true;
        return false;
    }
    public boolean bigcomp(computer a){
        if(a.size_in >= 13) return true;
        return false;
    }
}
