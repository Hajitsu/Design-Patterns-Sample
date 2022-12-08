package ir.hajitsu.composite;

public class Main {
    public static void main(String[] args) {
        Menu rootMenu = new Menu("/transfer", "Transfer Money");
        rootMenu.add(new MenuItem("/card-to-card", "Card To Card"))
                .add(new MenuItem("/acount", "Account Manager"));

        Menu subMenu = new Menu("/by-iban", "By IBAN");
        subMenu.add(new MenuItem("/paya", "PAYA"))
                .add(new MenuItem("/satna", "SATNA"));

        rootMenu.add(subMenu);
        System.out.println(rootMenu.toString());
    }
}
