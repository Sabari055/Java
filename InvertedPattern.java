public class InvertedPattern {

    public void invertedPattern() {
        int N = 5;
        int i = N;
        while (i > 0) {

            int j = i;
            while (j > 0)
            {
                System.out.print(i);
                j--;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        InvertedPattern obj = new InvertedPattern();
        obj.invertedPattern();
    }
}