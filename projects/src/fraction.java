public class fraction {
    private int num;
    private int dem;

    public fraction() {
        num = 1;
        dem = 2;
    }
    public fraction(int n, int d) {
        num = n;
        dem = d;
    }
    public int getNum() {
            return num;
        }
    public int getDem() {
            return dem;
        }
    public void setNum(int a) { num = a; }
    public void setDem(int b) { dem = b; }
    public String toString() {
        if(num == 1) return num + " ";
        else return num + " / " + dem;
    }
    public void simplify() {
        int sign = 1;
        if (num < 0 && dem < 0) {
            num *= -1;
            dem *= -1;
        } else if (num < 0 || dem < 0) {
            sign = -1;
            if (num < 0) num *= -1;
            if (dem < 0) dem *= -1;
        }
        int x;
        if (num < dem)
            x = num;
        else
            x = dem;
        int i = x;
        boolean yess = false;
        while (i > 1 && !yess) {
            if (num % i == 0 && dem % i == 0) {
                yess = true;
                num /= i;
                dem /= i;
            }
            i--;
        }
        num *= sign;
    }
}
