package Datetime;

public class Test {
    public static void main(String[] args) {
        DateTime2 datetime = new DateTime2("2023-03-21 16:16:26");

        System.out.println(datetime.getDatum().getString());
        System.out.println(datetime.getDatum().getJahr());
        System.out.println(datetime.getDatum().getMonat());
        System.out.println(datetime.getDatum().getTag());

    }
}
