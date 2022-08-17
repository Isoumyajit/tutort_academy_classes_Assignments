package class_2.Soumyajit;

public class consecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3)
            return false;
        for (int i = 0, count = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
                if (count == 3)
                    return true;
            } else
                count = 0;
        }
        return false;
    }
}
