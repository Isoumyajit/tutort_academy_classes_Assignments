package class_2.Soumyajit;

public class richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] a : accounts) {
            int wealth = 0;
            for (int money : a) {
                wealth += money;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}
