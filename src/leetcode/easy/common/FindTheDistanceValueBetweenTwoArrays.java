package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/find-the-distance-value-between-two-arrays/>1385. Find the Distance Value Between Two Arrays</a>}.
 */
public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            int el1 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int diff = Math.abs(el1 - arr2[j]);
                if (diff <= d) {
                    counter++;
                    break;
                }
            }
        }
        return arr1.length - counter;
    }
}
