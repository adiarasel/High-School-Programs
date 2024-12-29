public class intint {
    private int value;
    private String name;

    public intint(int val, String name){
        value = val;
        this.name = name;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return "int "+name+" = "+value;
    }
}
