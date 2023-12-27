package leetcode.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/destination-city/">1436. Destination City</a>}.
 */
public class DestinationCity {

    // Input: paths = [["B","C"],["D","B"],["C","A"]]
    // Output: "A"
    public String destCity(List<List<String>> paths) {
        if (paths.size() == 1) return paths.get(0).get(1);
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (String city : map.values()) {
            if (!map.containsKey(city)) {
                return city;
            }
        }
        throw new UnsupportedOperationException();
    }

    public String destCityI(List<List<String>> paths) {
        String s = paths.get(0).get(1);
        if (paths.size() == 1) return paths.get(0).get(1);
        boolean flag = true;
        while (flag) {
            for (int i = 1; i < paths.size(); i++) {
                String f = paths.get(i).get(0);
                if (s.equalsIgnoreCase(f)) {
                    s = paths.get(i).get(1);
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return s;
    }

    public String destCityII(List<List<String>> paths) {

        String s = paths.get(0).get(1);

        if (paths.size() == 1) return s;

        HashSet<String> fElements = new HashSet<>();
        HashSet<String> sElements = new HashSet<>();

        for (List<String> lists : paths) {
            fElements.add(lists.get(0));
            sElements.add(lists.get(1));
        }

        for (String str : sElements) {
            if (!fElements.contains(str)) s = str;
        }

        return s;
    }
}
