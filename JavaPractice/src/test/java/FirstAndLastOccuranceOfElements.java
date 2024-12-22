public class FirstAndLastOccuranceOfElements {

    public static void main(String args[]) {
        int nums[] = {0, 0, 0, 0, 1, 3};

        int target = 0;

        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }


        System.out.println("First and Last Positions of " + target + ": " + first + " and " + last);
    }
}
