package Homework.HW_2;

import static java.lang.Integer.MIN_VALUE;

public class hw_2 {
    public static void main(String[] args) {
        System.out.println("\u2764" + " " + "\uD83D\uDD0A\u261d" + " " + "\u0024" + " " + "\u2652" + " " + "\u266B");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("Integer max value = " + Integer.MAX_VALUE + "\nInteger min value = "
                + MIN_VALUE);

        int i = MIN_VALUE;
        System.out.println(
                        ".             .  . . . . . .   .              .                . . . . . .\n" +
                        ".             .  .             .              .                .         .\n" +
                        ". . . . . . . .  . . . . .     .              .                .         .\n" +
                        ".             .  .             .              .                .         .\n" +
                        ".             .  .             .              .                .         .\n" +
                        ".             .  . . . . . .   . . . . . .    . . . . . . .    . . . . . .\n"
        );
        int a = 10;
        int b = 10;
        System.out.println(Integer.compare(a, b));
        Float f = 234.9999F;
        System.out.println(Math.round(f));
    }
}
