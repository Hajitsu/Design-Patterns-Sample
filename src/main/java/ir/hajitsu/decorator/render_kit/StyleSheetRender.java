package ir.hajitsu.decorator.render_kit;

public class StyleSheetRender extends Render {
    private Render render;

    public StyleSheetRender(Render render, Attribute... attributes) {
        super(attributes);
        this.render = render;
    }

    public StyleSheetRender() {
    }

    @Override
    public String write() {
        String styles = writeAttributeAsStyle(getAttributes());
        if (styles != null) {
            styles = "style=\"" + styles + "\"";
        }
        return "<div class='form-input' " + styles + ">" +
                render.write() +
                "</div> ";
    }
}
