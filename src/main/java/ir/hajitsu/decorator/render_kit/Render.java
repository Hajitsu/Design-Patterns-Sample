package ir.hajitsu.decorator.render_kit;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Render {
    private Attribute[] attributes;

    public Attribute[] getAttributes() {
        return attributes;
    }

    public abstract String write();

    public Render(Attribute... attributes) {
        this.attributes = attributes;
    }

    public Render() {
    }

    protected String writeAttributes(Attribute... attributes) {
        String result = "";
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + "='" + attr.getValue() + "' ")
                    .reduce("", String::concat);
        }
        return result;
    }

    protected String writeAttributeAsStyle(Attribute... attributes) {
        String result = "";
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + ":" + attr.getValue() + ";")
                    .reduce("", String::concat);
        }
        return result;
    }
}
