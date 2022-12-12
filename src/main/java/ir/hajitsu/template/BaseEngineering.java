package ir.hajitsu.template;

public abstract class BaseEngineering {
    public void study() {
        math();
        physics();
        additionalStudy();
    }

    private void math() {
        System.out.println("Study math");
    }

    public abstract void additionalStudy();

    private void physics() {
        System.out.println("Study physics");
    }
}
