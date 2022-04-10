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
        int t = Integer.MAX_VALUE;
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

        int c = 23;
        int expectedResult = 69;

         if ( c % 2 != 0) {
             if (c % 3 == 0) {
                 c = c / 3;
             }   else {
                 c = c * 3;
             }
         } else {
             c = c * (c / 2);
         }
        System.out.println(c);

    if (expectedResult == c) {
        System.out.println("\u001B[32m" + "passed");
    } else {
        System.out.println("\u001B[31m" + "failed");
        }
    double result = 10.0 / 3;
        System.out.println(result);
    double r = ((double) 10) / 3;
        System.out.println(r);
    }
}
