package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/license-key-formatting/">482. License Key Formatting</a>}.
 */
public class LicenseKeyFormatting {

    // Input: s = "2-5g-3-J", k = 2
    // Output: "2-5G-3J"
    public String licenseKeyFormatting(String s, int k) {
        String s1 = s.replaceAll("-", "").toUpperCase();
        if (s1.length() <= k) return s1;
        int c = 0;
        while (c <= k) {
            if ((s1.length() - c) % k == 0) break;
            c++;
        }
        StringBuilder builder = new StringBuilder(s1);
        for (int i = c + k; i < builder.length(); i = i + k + 1) {
            builder.insert(i, "-");
        }
        if (c != 0) builder.insert(c, "-");
        return builder.toString();
    }

    public String licenseKeyFormattingI(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != '-')
                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
        return sb.reverse().toString().toUpperCase();
    }
}