public class strstr {
    private String value;
    private String name;
    public strstr(String val, String name){
        value = val;
        this.name = name;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "string "+name+" = "+value;
    }
}
