package ir.hajitsu.builder;

public class Main {
    public static void main(String[] args) {
        H264PropertiesBuilder builder = new H264PropertiesBuilder();
        builder.Property1(12).
                Property6("Hi").
                Property11(true)
                .build();
    }
}
