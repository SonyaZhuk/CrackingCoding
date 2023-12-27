package leetcode.easy.string;


import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/reformat-date/">1507. Reformat Date</a>}.
 */
public class ReformatDate {

    private final List<String> MONTHS = List.of("", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

    // Input: date = "20th Oct 2052"
    // Output: "2052-10-20"
    public String reformatDate(String date) {
        String[] arr = date.split("\\s");
        StringBuilder builder = new StringBuilder();
        String part2 = arr[1];
        builder.append(arr[2]).append("-");
        switch (part2) {
            case "Jan":
                builder.append("01");
                break;
            case "Feb":
                builder.append("02");
                break;
            case "Mar":
                builder.append("03");
                break;
            case "Apr":
                builder.append("04");
                break;
            case "May":
                builder.append("05");
                break;
            case "Jun":
                builder.append("06");
                break;
            case "Jul":
                builder.append("07");
                break;
            case "Aug":
                builder.append("08");
                break;
            case "Sep":
                builder.append("09");
                break;
            case "Oct":
                builder.append("10");
                break;
            case "Nov":
                builder.append("11");
                break;
            case "Dec":
                builder.append("12");
                break;
            default:
                throw new UnsupportedOperationException();
        }
        String s3 = arr[0].replaceAll("\\D", "");
        s3 = (s3.length() == 1) ? "0".concat(s3) : s3;
        builder.append("-").append(s3);
        return builder.toString();
    }


    public String reformatDateI(String date) {
        var parts = date.split(" ");
        return new StringBuilder(parts[2])
                .append("-")
                .append(String.format("%02d", MONTHS.indexOf(parts[1])))
                .append("-")
                .append(String.format("%02d", Integer.parseInt(parts[0].substring(0, parts[0].length() - 2))))
                .toString();
    }
}
