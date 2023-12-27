package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/">345. Reverse Vowels of a String</a>}.
 */
public class ReverseVowelsOfString {

    // Input: s = "leetcode"
    // Output: "leotcede"
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
            while (i < j && ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U') {
                i++;
            }
            while (j > i && ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u' && ch[j] != 'A' && ch[j] != 'E' && ch[j] != 'I' && ch[j] != 'O' && ch[j] != 'U') {
                j--;
            }
            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }

    public String reverseVowelsI(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();

        int start = 0, end = n - 1;
        while (start < end) {
            while (start < end && !isVowel(ch[start])) {
                start++;
            }
            while (start < end && !isVowel(ch[end])) {
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(ch);
    }

    private boolean isVowel(char chr) {
        if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'
                || chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
            return true;
        }
        return false;
    }
}
