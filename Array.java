class Array{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8};
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = arr[i];
            System.out.println(num[i]);
        }
}
}