import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelloWorld {
    public static void main(String[] args) {

        // Reverse string
        String x = "abc";
        System.out.print(reverse(x));

        // Find max value
//        int[] x = {1,2,3,4,5};
//        System.out.print(findMaxValue(x));

        // check duplicates
//        int[] array = {1, 1, 2, 2, 3};
//        System.out.print(checkDuplicates(array));

        // findAvg
//        int[] array = {1,20,30};
//        System.out.print(Arrays.toString((findAvg(array))));

        // Palindrome
//        System.out.print(checkPalindrome(-121));

        // Sort array by parity 2
//        int[] x = {4,4,1};
//        System.out.print(Arrays.toString(sortArrayByParityII(x)));

        // Two sums
//        int[] x = {2, 7, 11, 15};
//        System.out.print(Arrays.toString(twoSum(x, 9)));

    }

    public static int reverse(String x) {
        long a = 0;


        for (int i = 0; i < x.length(); i++) {
            a += x[i].length();
        }
        return a;
    }

//    public static String reverse(String x) {
//        String[] letter = x.split("");
//        StringBuilder a = new StringBuilder();
//
//        for (int i = letter.length - 1; i >= 0; i--) {
//            a.append(letter[i]);
//        }
//
//        return a.toString();
//    }

    public static List<Integer> findAvg(int[] x) {
        int max = 0;
        int average;
        List<Integer> averageList = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            max += x[i];
        }
        average = max / x.length;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > average) {
                averageList.add(x[i]);
            }
        }
        return averageList;
    }

    public static int findMaxValue(int[] a) {
        String length = String.valueOf(1);
        int maxVal = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
            }
        }
        return maxVal;
    }

    public static List<Integer> checkDuplicates(int[] x) {
        List<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == (x[j])) {
                    duplicate.add(x[i]);
                }
            }
        }
        // convert duplicate to Integer array
//        Integer[] ArrayDup = duplicate.toArray(new Integer[duplicate.size()]);
        return duplicate;
    }

    public static Boolean checkPalindrome(int x) {
        String[] stringName = String.valueOf(x).split("");
        String[] reverse = new String[stringName.length];
        int index = 0;

        for (int i = stringName.length - 1; i >= 0; i--) {
            System.out.print(stringName[i]);
            reverse[index] = stringName[i];
            index++;
        }
        return Arrays.equals(reverse, stringName);


//        StringBuilder y = new StringBuilder();
//        y.append(x);
//
//        try {
//            return Integer.parseInt(y.reverse().toString()) == x;
//
//        } catch (NumberFormatException e) {
//            return false;
//        }

    }


    public static int[] sortArrayByParityII(int[] nums) {
        int[] Array = new int[nums.length];
        int even = 0;
        int odd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                Array[odd] = nums[i];
                odd += 2;
            } else {
                Array[even] = nums[i];
                even += 2;
            }
        }
        return Array;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] Array = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    Array[0] = j;
                    Array[1] = i;
                    break;
                }
            }
        }
        return Array;
    }
}