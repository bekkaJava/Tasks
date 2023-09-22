package task3;

public class Task3 {
    int notContains(int[] array) {

        int notContains = 1;

        for (int x : array) {
            if (x >= 1 && x == notContains) {
                notContains = x + 1;
            }
        }

        return notContains;
    }

}
