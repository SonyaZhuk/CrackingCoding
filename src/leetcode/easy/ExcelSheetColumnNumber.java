package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/excel-sheet-column-number/">171. Excel Sheet Column Number</a>}.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        if (columnTitle.length() == 1)
            return columnTitle.charAt(0) - 'A' + 1;

        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum *= 26;
            sum += columnTitle.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}
