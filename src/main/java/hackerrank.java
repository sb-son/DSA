import java.util.ArrayList;
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
}
