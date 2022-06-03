package udemy;

public class Lection {
    public static void main(String[] args) {
        String str1 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str1.toCharArray();
        System.out.println(helloArray);

        String str3 = "Год " + 2015;
        System.out.println(str3);

        System.out.println("abcd");
        System.out.println(); // print empty line
        System.out.println("efgj");

        int a1 = 60;
        int a2 = 0B111100; // 0B or 0b -  двоичная система счисления
        int a3 = 0b00111100;
        int a4 = 074; //восьмеричная система счисления
        int a7 = 0_74;
        int a5 = 0x3C; // 0x or 0X - 16-тиричная система счисления
        int a6 = 0X3c;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        byte b1 = 12;
        byte b2 = 0_14;
        byte b3 = 0b1100;
        byte b4 = 0xC;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0_2424;
        short s3 = 0B0101_0001_0100;
        short s4 = 0X514;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0_0;
        int i3 = 0B0;
        int i4 = 0X0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);


        long l1 = 123456789L;
        long l2 = 0_726_746_425L;
        long l3 = 0B0111010110111100110100010101L;
        long l4 = 0X75BCD15L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        char c1 = 1280; // десятиричная система счисления
        char c2 = '+';
        char c3 = '\u0500'; // 16-тиричная система счисления

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int x = 6;
        int y = 3;

        int z = x - y++;

        System.out.println(z);
        System.out.println(y);

        int q = x - ++y;
        System.out.println(q);
        System.out.println(y);

        int r = 5;
        System.out.println(++r);
        System.out.println(r);

        x = y = z = 18; // z = 18; y = 18; x = 18; присваивание начинается справа

        long f = 100L;
        int b = 10;
        f = b;
        System.out.println(f);

        short g = 100;
        int h = g;
        float j = f;
        System.out.println(h + " " + j);

        boolean d = false && true;
        boolean e = true || false;

        int w1 = 10;
        int w2 = 50;
        int w3 = 99;
        int w4 = 100;

//        boolean w5 = w1 < w2 || ++w3 == w4;
//        System.out.println(w5);
//        System.out.println(w3);
//
//        boolean w6 = w1 < w2 | ++w3 == w4;
//        System.out.println(w6);
//        System.out.println(w3);

        boolean w7 = w1 < w2 || ++w3 == w4;
        System.out.println(w7);
        System.out.println(w3);

        boolean w8 = w1 < w2 | ++w3 == w4;
        System.out.println(w8);
        System.out.println(w3);

        boolean g1 = false;
        boolean g2 = g1 == true;
        System.out.println(g2);
        boolean g3 = g1 = true;
        System.out.println(g3);

        int t1 = 5;
        int t2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = t2 / d1 + d2 % t1 - l;
        System.out.println(result);

        int u = 5;
        int result1 = u-- - --u + ++u + u++ + u; //5 -3 + 4 + 4 + 5
        System.out.println(result1);

        int o = 8;
        int result2 = ++b - b++ + ++b - --b;
        System.out.println(result2);

        char ch = 'a';
        int in = 10;
//        int in1 = ch;
//        System.out.println(in1);
        int v = in % ch;
        System.out.println(v);

        String a = "200";
        double ba = Double.parseDouble(a);
        System.out.println(ba);
    }
}
