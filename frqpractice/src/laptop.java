public class laptop extends computer{
    boolean touchID;
    public laptop(){
        size_in = 14;
        CPU_quality = "fair";
        color = "white";
        touchID = false;
    }
    public laptop(int size, String qual, String col, boolean touch){
        size_in = size;
        CPU_quality = qual;
        color = col;
        touchID = touch;
    }
    public boolean yestouch(laptop b){
        return b.touchID;
    }
}
