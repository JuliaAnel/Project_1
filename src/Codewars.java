public class Codewars {
        int width;
        int length;
        int height;

        public Codewars (int[] block) {
            this.width = block[0];
            this.length = block[1];
            this.height = block[2];
        }

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
    }


