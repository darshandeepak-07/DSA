package interview150;

public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        int minIndex = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }

        for (int i = minIndex + 1; i < prices.length; i++) {
            if (prices[i] > max) max = prices[i];
        }
        int profit = 0;
        int res = max - min;
        if (res > 0) {
            profit = res;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(nums));
    }
}
