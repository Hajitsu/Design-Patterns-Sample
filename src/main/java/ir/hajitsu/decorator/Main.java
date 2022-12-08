package ir.hajitsu.decorator;

import ir.hajitsu.decorator.render_kit.Attribute;
import ir.hajitsu.decorator.render_kit.Render;
import ir.hajitsu.decorator.render_kit.StyleSheetRender;
import ir.hajitsu.decorator.render_kit.SubmitInputElement;

public class Main {
    public static void main(String[] args) {
        Render submitInputElement = new SubmitInputElement(
                new Attribute("id", "id12"),
                new Attribute("name", "save")
        );

//        System.out.println(submitInputElement.write());
        StyleSheetRender sheetRender = new StyleSheetRender(submitInputElement,
                new Attribute("height", "200px")
        );
        System.out.println(sheetRender.write());
    }

}
