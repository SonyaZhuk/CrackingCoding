package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/number-of-senior-citizens/">2678. Number of Senior Citizens</a>}.
 */
public class NumberOfSeniorCitizens {

    public int countSeniors(String[] details) {
        int counter = 0;
        for (String pass : details) {
            if (Integer.parseInt(pass.substring(11, 13)) > 60) counter++;
        }
        return counter;
    }
}
