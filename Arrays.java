class Arrays {

    public int[] addArray() {

        int nums[] = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = 1;
        }
        return nums;

    }

    public static void main(String[] args) {
        
        Arrays obj = new Arrays();
        int[] result = obj.addArray();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}