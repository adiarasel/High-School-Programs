public class pieces {
    private int xCor;
    private int yCor;
    private boolean king;
    private String appearance = ".";

    public pieces(){
        xCor = 0;
        yCor = 0;
        king = false;
        appearance = ".";
    }

    public pieces( int y, int x, boolean b, String app){
        xCor = x;
        yCor = y;
        king = b;
        appearance = app;
    }

    public int getX(){
        return xCor;
    }

    public int getY(){
        return yCor;
    }

    public String getApp(){
        return appearance;
    }

    public boolean kingStatus(){
        return king;
    }

    public void setX(int x){
        xCor = x;
    }

    public void setY(int y){
        yCor = y;
    }

    public void setApp(String a){
        appearance = a;
    }

    public void makeKing(boolean k){
        king = k;
    }
}
