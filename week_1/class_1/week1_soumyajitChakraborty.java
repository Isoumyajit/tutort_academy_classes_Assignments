package class_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class week1_soumyajitChakraborty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the question number");
        int question = sc.nextInt();
        callDesired(question, sc);
    }

    private static void callDesired(int option, Scanner sc) {
        switch (option) {
            case 1:
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.print(new question_1().callFunction(arr));
                break;
            case 2:
                n = sc.nextInt();
                arr = new int[n];
                int key = sc.nextInt();
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.print(new question_2().getIndexValue(arr, key));
                break;
            case 3:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                int findKey = sc.nextInt();
                System.out.print(new question_3().getTotalnumbers(arr, findKey));
                break;
            case 4:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                int[] answer = (new question_4().getAlternateOrder(arr));
                for (int i = 0; i < answer.length; i++)
                    System.out.print(answer[i] + " ");

                break;
            case 5:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                Integer ans[] = new question_5().getSameAsIndexElements(arr);
                for (int i = 0; i < ans.length; i++)
                    System.out.print(ans[i] + " ");
                break;

            case 6:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.print(new question_6().isPerfect(arr) == true ? "PERFECT" : "Not PERFECT");
                break;

            case 7:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.print(new question_7().getRemainingLast(arr));
                break;

            case 8:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print(new question_8().discardTwoHighest(arr));
                break;

            case 9:
                n = sc.nextInt();
                System.out.print(n * (n + 1) / 2);
                break;
            case 10:
            case 11:
            default:

        }
        System.out.println();
    }
}

class question_1 {
    private long getSum(int[] arr) {
        long sum = 0;
        for (long a : arr)
            sum += a;
        return sum;
    }

    public long callFunction(int[] arr) {
        return getSum(arr);
    }
}

class question_2 {
    int getIndexValue(int[] arr, int key) {
        if (key < 0 || key >= arr.length)
            return -1;
        else
            return arr[key];
    }
}

class question_3 {

    public int getTotalnumbers(int[] arr, int key) {
        int index = binarySearch(arr, key);
        return (index - 0 + 1);
    }

    private int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                if (mid < arr.length && arr[mid] == arr[mid + 1])
                    low = mid + 1;
                else {
                    high = mid;
                    break;
                }
            } else if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return high;
    }
}

class question_4 {

    int[] getAlternateOrder(int[] arr) {
        int len = arr.length % 2 == 0 ? arr.length / 2 : arr.length / 2 + 1;
        int[] ans = new int[len];
        for (int i = 0, index = 0; i < arr.length; i += 2)
            ans[index++] = arr[i];
        return ans;
    }
}

class question_5 {

    Integer[] getSameAsIndexElements(int[] arr) {
        ArrayList<Integer> helper = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr[i])
                helper.add(arr[i]);
        }
        return helper.toArray(new Integer[0]);
    }
}

class question_6 {

    boolean isPerfect(int[] arr) {
        return validate(arr);
    }

    private boolean validate(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--)
            if (arr[i] != arr[j])
                return false;
        return true;
    }
}

class question_7 {

    int getRemainingLast(int[] arr) {
        return getLastSurvived(arr);
    }

    private static int getLastSurvived(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        boolean flag = false;
        while (i < j) {
            if (!flag) {
                j--;
                flag = true;
            } else {
                i++;
                flag = false;
            }
        }
        return arr[i];
    }
}

class question_8 {

    ArrayList<Integer> discardTwoHighest(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr.length == 0 || arr.length == 1 || arr.length == 2)
            return ans;
        Arrays.sort(arr);
        int max1 = arr[arr.length - 1];
        int max2 = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max1 < arr[i])
                max1 = arr[i];
            else if (max2 < arr[i] && arr[i] < max1) {
                max2 = arr[i];
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max2) {
                ans.add(arr[i]);
            } else
                break;
        }
        return ans;
    }
}