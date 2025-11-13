public class Cheers {
    public static void main(String[] args) {
        String name = args[0];
        name = name.toUpperCase();
        int times = Integer.parseInt(args[1]);
        int length = name.length();

        String check = "AEFHILMNORSX"; 

        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);

            if (check.indexOf(ch) != -1) {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(name + "!!!");
        }
    }
}
