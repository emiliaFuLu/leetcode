import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: fl
 * @data: 2020-04-26 00:11
 * @description: 全排列,深度优先遍历的回溯
 **/
public class reback {

    @Test
    public void test(){
        int[] a = {1,2,3,4};
        List<List<Integer>> reback = reback(a);
        System.out.println(reback);
    }

    public List<List<Integer>> reback(int[] nums) {
        int length = nums.length;
        List<List<Integer>> ret = new ArrayList<>();
        if (length == 0) {
            return new ArrayList<>();
        }

        Deque<Integer> path = new ArrayDeque<Integer>();
        boolean[] used = new boolean[length];
        dfs(nums, length, 0, path, used, ret);

        return ret;
    }

    private void dfs(int[] nums, int length, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> ret) {
        if (depth == length) {
            ret.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, length, depth + 1, path, used, ret);
            path.removeLast();
            used[i] = false;
        }
    }

}
