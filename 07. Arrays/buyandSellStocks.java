import java.util.Scanner;

public class buyandSellStocks {
    
    public static int buy_sell_stocks(int prices[]) { // O(n)
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) { // profit
            if (buyPrices < prices[i]) {
                int profit = prices[i] - buyPrices; // today's profit
                maxProfit = Math.max(maxProfit, profit); // Global max profit
            }
            else {
                buyPrices = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Days: ");
        int days = sc.nextInt();
        int prices[] = new int[days];
        System.out.print("Enter Prices: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit: " + buy_sell_stocks(prices));
    }
}