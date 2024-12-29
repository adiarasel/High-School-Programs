public abstract class abstractentity {
    int id;

    public void setId() {
        this.id = (int)(Math.random() * 100000000);
    }
    // how do you check for the uniqueness here??

    public int getId() {
        return id;
    }
}
