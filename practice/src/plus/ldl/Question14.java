package plus.ldl;

import java.util.HashSet;

/**
 * @author ldl.plus
 * @date 2020年02月20日  21:26
 * 最长公共前缀
 */
public class Question14 {
    public static String longestCommonPrefix(String[] strs) {
        HashSet<Character> set = new HashSet<>();
        for (String str : strs) {
            boolean b1 = set.add(str.charAt(0));
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
