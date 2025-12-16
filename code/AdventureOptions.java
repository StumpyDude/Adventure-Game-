public class AdventureOptions {

    public static void Options(int pos) {
        switch (pos) {
            case 1 -> System.out.println("coin");
            case 2 -> System.out.println("house");
            case 3 -> System.out.println("path");
            case 4 -> System.out.println("tree");
            case 5 -> System.out.println("river");
            case 6 -> System.out.println("mountain");
            case 7 -> System.out.println("bridge"); 
            case 8 -> System.out.println("cave");
            case 9 -> System.out.println("forest"); 
            case 10 -> System.out.println("castle");
            default -> {
            }
        }
    }
}
