package ir.hajitsu.visitor;

public class Test {
    public static void main(String[] args) {
        Content content = new Content(118);
        System.out.println(content.getData());
        content.accept(new AddVisitor());
        System.out.println(content.getData());

        content.accept(content1 -> content1.setData(content1.getData() * 2));
        System.out.println(content.getData());
    }
}
