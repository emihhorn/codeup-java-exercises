public class JavaIIIwarmup {

        public static void main(String[] args) {
            System.out.println(sameFirstAndLast("Bob"));
            System.out.println(sameFirstAndLast("steve"));
            System.out.println(sameFirstAndLast("refrigerator"));
            System.out.println(sameFirstAndLast("q2kdj3vq"));
        }
        public static boolean sameFirstAndLast(String input) {
            char first = Character.toLowerCase(input.charAt(0));
            char last = Character.toLowerCase(input.charAt(input.length() - 1));
            return first == last;
        }
    }


