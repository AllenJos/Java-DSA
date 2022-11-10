
//Code to find out the maximum profit we can make if the stock prices are given
//for N different days.
public class StockBuyAndSell {
    public static void main(String[] args) {
//        int[] arr = {1, 5, 3, 8, 12}; //expected outcome: 13
        int[] arr = {1, 5, 3, 1, 2, 8}; //expected outcome: 11
        int maxProfit = maxProfitFromStock(arr);
        System.out.println(maxProfit);
    }

    private static int maxProfitFromStock(int[] arr) {
        int profit=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1])
                profit += (arr[i]-arr[i-1]);
        }
        return profit;
    }
}
