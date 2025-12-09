public class AdventureOptions {

    public static void Options(int pos) {
        switch (pos) {
            case 1 -> System.out.println("coin");
            case 2 -> System.out.println("house");
            case 3 -> System.out.println("path");
            default -> {
            }
        }
    }
}
