package ir.hajitsu.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class MenuComponent {
    protected List<MenuComponent> children = new ArrayList<>();
    private final String url;
    private final String name;

    public MenuComponent(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new IllegalStateException("Not supported in this level.");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new IllegalStateException("Not supported in this level.");
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    protected String print() {
        return String.format("%s -> %s%n", name, url);
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuComponent that = (MenuComponent) o;
        return Objects.equals(url, that.url) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name);
    }
}
