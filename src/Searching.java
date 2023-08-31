public class Searching {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        seqSearch(9, nums);

    }

    static void seqSearch(int target, int[] nums) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("data " + target + " berada pada index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("data tidak ditemukan");
        }
    }

    static void binSearch(int targer, int[] nums) {
        // code ..
    }
}
