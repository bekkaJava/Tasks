package task2;

public class Task2 {


    int minSplit(int amount) {

        int[] coins = {50, 20, 10, 5, 1};
        int minSplit = 0;

        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                minSplit++;
            }

        }
        return minSplit;

    }


}
