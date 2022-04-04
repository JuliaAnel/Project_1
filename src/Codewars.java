public class Codewars {
        int width;
        int length;
        int height;


//        public Codewars (int[] block) {
//            this.width = block[0];
//            this.length = block[1];
//            this.height = block[2];
//        }

        int getWidth () {
            return this.width;
        }

        int getLength () {
            return this.length;
        }

        int getHeight () {
            return this.height;
        }

        int getVolume () {
            return this.width * this.length * this.height;
        }

        int getSurfaceArea () {
            return 2 * (this.width * this.length + this.length * this.height + this.width * this.height);
        }
//геттеры и сеттеры
    private int side;

    int getSide () {
        return side;
    }

    int setSide (int num) {
        return this.side = num;
    }

    public String countingSheep(int num) {
        String text = " sheep...";
        String result = "";

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                result += i + text;
            }
        }
        else {
            return "Integer must be more than 0";
            }
        return result;
    }


}



