package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/reverse-only-letters/">917. Reverse Only Letters</a>}.
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        //"a-bC-dEf-ghIj"
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();

        while (i < j) {

            if (Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if(!Character.isLetter(arr[i])) {
                i++;
            }

            if (!Character.isLetter(arr[j])) {
                j--;
            }
        }

        return new String(arr);
    }
}
