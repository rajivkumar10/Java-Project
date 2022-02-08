package arrays;

public class StockBuySell {

    public static void main(String[] args) {
        int arr[] = {14, 12, 70, 15, 99, 65, 21, 90};
        int pair[] = new int[2];
        int maxProfit = calculateMaxProfit(arr, pair);
        System.out.println("Buy at " + pair[0] + " and sell at "+ pair[1] + ", MaxProfit : " + maxProfit);
    }

    public static int calculateMaxProfit(int[] arr, int[] pair) {
        int lastPriceOfTheDay = arr[0];
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length - 1; i++) {
            int profit = 0;
            if (arr[i] > lastPriceOfTheDay) {
                profit = arr[i] - lastPriceOfTheDay;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    pair[0] = lastPriceOfTheDay;
                    pair[1] = arr[i];
                }
            } else {
                lastPriceOfTheDay = arr[i];
            }
        }
        return maxProfit;
    }


}
