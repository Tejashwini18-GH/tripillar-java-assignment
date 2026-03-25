package assignment.module9;

// LeetCode 46 - Permutations
import java.util.*;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }
    private static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int n : nums) {
            if (temp.contains(n)) continue;
            temp.add(n);
            backtrack(res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        for (List<Integer> list : result)
            System.out.println(list);
    }
}
