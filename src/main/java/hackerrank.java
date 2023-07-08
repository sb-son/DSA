import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hackerrank {
    public static void main(String[] args) {
        //compareTriplets problem

        //test case
        ArrayList<Integer> a = new ArrayList<>(List.of(5, 6, 7));
        ArrayList<Integer> b = new ArrayList<>(List.of(7, 6, 5));
        //should result in [1,1]

        System.out.println(compareTriplets(a, b));

        //staircase problem

        //test case
        //should output:
        //     #
        //    ##
        //   ###
        //  ####
        // #####
        //######

        staircase(6);

        //miniMaxSum problem

        //test case
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        //should result in: 10 14

        miniMaxSum(arr);

        //birthdayCakeCandles problem

        //test case
        ArrayList<Integer> candles = new ArrayList<>(List.of(0, 3, 2, 2));

        System.out.println(birthdayCakeCandles(candles));

        String time12Hour = "07:05:45PM";

        System.out.println(timeConversion(time12Hour));
    }

    //compareTriplets problem
    public static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        ArrayList<Integer> scores = new ArrayList<>(List.of(aliceScore, bobScore));
        return scores;
    }

    //staircase problem
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder spaces = new StringBuilder();
            StringBuilder stairs = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                spaces.append(" ");
            }

            for (int k = 0; k < i; k++) {
                stairs.append("#");
            }

            System.out.println(spaces.toString() + stairs);
        }
    }

    //miniMaxSum problem
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        long maxSum = 0;
        long minSum = 0;

        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }

        for (int i = arr.size() - 1; i >= arr.size() - 4; i--) {
            maxSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeight = 0;
        int count = 0;

        for(int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == maxHeight) {
                count++;
            } else if (candles.get(i) > maxHeight) {
                maxHeight = candles.get(i);
                count = 1;
            }
        }
        return count;
    }

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        boolean isAM = s.endsWith("AM");

        if (isAM) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
