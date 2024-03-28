package org.example;

/**
 Given a sorted array of integers in non-decreasing order, you need to find two numbers in the array that
 add up to a specific target. The indices of these two numbers, denoted as index1 and index2, should be
 returned in a 1-indexed array [index1, index2].

 Here&#39;s an example:

 Input: numbers = [2,7,11,15], target = 9
 Output: [1,2]
 Explanation: The sum of 2 and 7 is 9. Therefore, index1 is 1, and index2 is 2. The function returns [1, 2].

 Constraints:

 The array &quot;numbers&quot; has at least two elements and at most 30,000 elements.
 Each element in &quot;numbers&quot; is between -1000 and 1000.
 The array &quot;numbers&quot; is sorted in non-decreasing order.
 The target value is between -1000 and 1000.
 There is exactly one solution for each test case.
 */
public class App 
{

    public static int[] findIndexs(int[] numbers, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = numbers.length-1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
            else if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }

        return result;
    }

    public static void main( String[] args )
    {
        int[] numbers = {2,7,11,15};
        int target = 22;

        int[] result = App.findIndexs(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }
}
