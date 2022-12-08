package ir.hajitsu.decorator.render_kit;

public class SubmitInputElement extends Render {
    public SubmitInputElement(Attribute... attributes) {
        super(attributes);
    }

    public SubmitInputElement() {
    }

    @Override
    public String write() {

        return "<input type='submit' " +
                writeAttributes(getAttributes()) +
                "/>";
    }
}
