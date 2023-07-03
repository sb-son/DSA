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


}
