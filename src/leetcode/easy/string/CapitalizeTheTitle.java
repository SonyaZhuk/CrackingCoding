package leetcode.easy.string;

import java.util.ArrayList;
import java.util.List;


/**
 * {@link <a href="https://leetcode.com/problems/capitalize-the-title/">2129. Capitalize the Title</a>}.
 */
public class CapitalizeTheTitle {

    // Input: title = "capiTalIze tHe titLe"
    // Output: "Capitalize The Title"
    public String capitalizeTitle(String title) {
        final String[] arr = title.split("\\s");
        final List<String> builder = new ArrayList<>();
        for (String s: arr) {
            if (s.length() <= 2) {
                builder.add(s.toLowerCase());
            } else {
                char[] ca = s.toLowerCase().toCharArray();
                ca[0] ^= 32; // toggle letter case.
                builder.add(String.valueOf(ca));
            }
        }
        return String.join(" ", builder);
    }
}
