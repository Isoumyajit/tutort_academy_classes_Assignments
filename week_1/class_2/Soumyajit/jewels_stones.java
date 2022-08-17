package class_2.Soumyajit;

public class jewels_stones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] hash = new int[256];
        for (char x : jewels.toCharArray())
            hash[x]++;

        for (char x : stones.toCharArray())
            if (hash[x] > 0) {
                count++;
            }

        return count;
    }
}
