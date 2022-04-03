public class Main1 {
//    public static int howOld(final String herOld) {
//        char c = herOld.charAt(0);
//        return Character.getNumericValue(c);
//    }
//    public static int howOld(final String herOld) {
//        String str = herOld.substring(0, 1);
//        return Integer.parseInt(str);
//    }
    //  public static void main(String[] args) {

    //     System.out.println(howOld("1 year old"));


//        public static int doubleInteger(int i) {
//
//            return i;
//        }

    public void findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        System.out.println(min);

//        public void findSmallestInt(int[] args) {
//            int min = args[0];
//            for (int i = 1; i < args.length; i++) {
//                if (min > args[i]) {
//                    min = args[i];
//                }
//            }
//        return min;
        // return min;
    }
//string to int #1 Integer.toString (variable)
    public String numberToString(int num) {
        return Integer.toString(num);
    }
//string to int #2 String.valueOf (variable)
    public String numberToString1(int num) {
            return String.valueOf(num);
}

    public static void main(String[] args) {
        double a = 2.0 - 1.1;
        System.out.printf("%.6f", a);
    }

//    public static int doubleInteger(int i) {
//        return Double.valueOf(i);
//    }
}


