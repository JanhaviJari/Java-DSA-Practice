import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args) {
        int coin[] = {2, 3, 4};
        int target = 6;
        System.out.println("Minimum number of coins required: " + minCoins(coin, target));
    }

    static int minCoins(int coins[], int target) {
        if (target == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin <= target) {
                int res = minCoins(coins, target - coin);
                if (res != Integer.MAX_VALUE) {
                    min = Math.min(min, res + 1);

                }
            }
        }
        return min;
    }
}