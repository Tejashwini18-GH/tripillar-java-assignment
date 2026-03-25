package assignment.module9;
// LeetCode 39 - Combination Sum
import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    private static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] arr, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            backtrack(res, temp, arr, target - arr[i], i);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        for (List<Integer> list : result)
            System.out.println(list);
    }
}
