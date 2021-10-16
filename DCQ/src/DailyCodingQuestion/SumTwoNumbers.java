package DailyCodingQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 *

 Element in Array :-> 6
 Elements of Array-> 1 2 3 4 5 6
 Sum of Two Sum of Two Number:-> 3

 6
 1 2 3 4 5 6
 3

 */
public class SumTwoNumbers {
    // TC -> O(n) : SC -> O(n) Using Hashset Approach
    static void solve(ArrayList<Integer> list, int sum){

        Boolean result = false;
        HashSet<Integer> hs= new HashSet<>();

        for (int i=0;i<list.size();i++){
            hs.add(list.get(i));
        }

        for (int i=0;i<list.size();i++){

        if(hs.contains(sum- list.get(i)))
            result = true;
        }
        if(result) System.out.print("Yes Present");
        else System.out.print("Not Present");

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int sumOfTwoNumber = sc.nextInt();;
        solve(list,sumOfTwoNumber);

    }
}
