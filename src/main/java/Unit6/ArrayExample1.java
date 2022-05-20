package Unit6;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] nums = {15,21,9,20,10,30};

        double sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double average = sum/ nums.length;
        System.out.println("Average: " + average);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 3 == 0 && nums[i] % 5 != 0){
                System.out.println(nums[i]);
        }else if(nums[i] % 5 == 0 && nums[i] % 3 != 0){
                System.out.println(nums[i]);
            }
        }
    }
}
