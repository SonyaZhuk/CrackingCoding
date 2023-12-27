package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/defanging-an-ip-address/">1108. Defanging an IP Address</a>}.
 */
public class DefangingAnIpAddress {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
