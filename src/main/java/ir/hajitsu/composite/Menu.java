package ir.hajitsu.composite;

public class Menu extends MenuComponent {

    public Menu(String url, String name) {
        super(url, name);
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        children.add(menuComponent);
        return this;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("::menu::");
        stringBuilder.append(print());
        children.forEach(leaf -> stringBuilder.append(leaf.toString()));
        return stringBuilder.toString();
    }
}
