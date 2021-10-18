package DailyCodingQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i
 * of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would
 * be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *

 Test Case 1:
 5
 1 2 3 4 5

 Test Case 2:
 3
 3 2 1

 *
 * Follow-up: what if you can't use division?
 */
public class ReturnProductOfAllTheNumbersExcepti {

   static public ArrayList<Integer> solve(ArrayList<Integer> arr){
       ArrayList<Integer> result = new ArrayList<>();
       for(int i=0;i<arr.size();i++){
           int skipI = i;
           int prod = 1;
           for (int j=0;j<arr.size();j++){
               if(i != j){
                   prod = prod * arr.get(j);
               }
           }
           result.add(prod);
       }
       return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print(solve(list));

    }
}
