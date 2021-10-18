package DailyCodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 3
 * 3 2 1
 *
 */
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(num)));
    }

    // This solution will have T.C -> O(n) S.C -> O(n) - product/num[i]
    static int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int flag = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                flag++;
            } else {
                prod *= nums[i];
            }
        }

        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(flag > 1){
                result[i] = 0;
            } else if(flag == 0){
                result[i] = prod/nums[i];
            } else if(flag ==1 && nums[i]!= 0){
                result[i] = 0;
            } else {
                result[i] = prod;
            }
        }
        return result;
    }
}
