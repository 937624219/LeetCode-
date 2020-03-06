package plus.ldl;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * @author ldl.plus
 * @ 数组中重复的数字
 * @date 2020年02月20日  17:47
 */
public class Question03 {
    /**
     * 找出数组中重复的数字。
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
     * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * 输入：  [2, 3, 1, 0, 2, 5, 3]
     * 输出：  2 或 3
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        /*//超出时间限制
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;*/
        /*//hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer key = map.put(nums[i], i);
            if (key != null) {
                return nums[i];
            }
        }
        return -1;*/
        //hashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean b = set.add(num);
            if (!b) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = new Random().nextInt(100000) + 1;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = new Random().nextInt(n);
        }
        int repeatNumber = findRepeatNumber(nums);
        System.out.println("repeatNumber = " + repeatNumber);
    }

    /**
     * 测试map的put方法返回值
     */
    @Test
    public void testPut() {
        HashMap<String, Integer> map = new HashMap<>();
        Integer v1 = map.put("1", 1);
        System.out.println("v1 = " + v1);
        Integer v2 = map.put("1", 2);
        System.out.println("v2 = " + v2);

        HashSet<Integer> set = new HashSet<>();
        boolean b1 = set.add(1);
        System.out.println("b1 = " + b1);
        boolean b2 = set.add(1);
        System.out.println("b2 = " + b2);
    }
}
