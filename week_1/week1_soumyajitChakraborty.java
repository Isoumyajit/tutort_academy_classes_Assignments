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
                System.out.println(new question_1().callFunction(arr));
                break;
            case 2:
                n = sc.nextInt();
                arr = new int[n];
                int key = sc.nextInt();
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(new question_2().getIndexValue(arr, key));
                break;
            case 3:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                int findKey = sc.nextInt();
                System.out.println(new question_3().getTotalnumbers(arr, findKey));
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

            case 6:
            case 7:
            case 8:
            case 9:
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

    int[] getSameAsIndexElements(int[] arr) {

    }
}