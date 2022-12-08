package ir.hajitsu.composite;

public class MenuItem extends MenuComponent {
    public MenuItem(String url, String name) {
        super(url, name);
    }

    @Override
    public String toString() {
        return "\t:item:" + print();
    }
}
