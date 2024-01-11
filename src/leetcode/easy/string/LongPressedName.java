package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/long-pressed-name/">925. Long Pressed Name</a>}.
 */
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        //name = "saeed", typed = "ssaaedd"

        if(name.equals(typed)) return true;

        int index = -1;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            index = typed.indexOf(ch, index + 1);
            if (index == -1) return false;
        }
        return true;
    }

    public boolean isLongPressedNameI(String name, String typed) {
        if (name.equals(typed))
            return true;
        if (name.length() > typed.length())
            return false;

        int i = 0;
        for (var j = 0; j < typed.length(); j++)
            if (i < name.length() && name.charAt(i) == typed.charAt(j))
                i++;
            else if (j == 0 || typed.charAt(j - 1) != typed.charAt(j))
                return false;

        return i == name.length();
    }
}