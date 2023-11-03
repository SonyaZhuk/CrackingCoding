package leetcode;

import leetcode.medium.ContainerWithMostWater;

public class MainClient {

    /**
     * Unit tests the CrackingCoding.
     */
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater container = new ContainerWithMostWater();
        System.out.println(container.maxArea(arr));
    }
}
