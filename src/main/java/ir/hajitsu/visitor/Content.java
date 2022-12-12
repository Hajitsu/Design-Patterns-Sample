package ir.hajitsu.visitor;

public class Content {
    private int data;

    public Content(int data) {
        this.data = data;
    }

    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
