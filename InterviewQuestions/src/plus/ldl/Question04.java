package plus.ldl;

/**
 * @author ldl.plus
 * @date 2020年02月20日  18:42
 * 二维数组中的查找
 */
public class Question04 {
    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增
     * 的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        /*//最笨办法
        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i == target) {
                    return true;
                }
            }
        }
        return false;*/
        for (int[] ints : matrix) {
            if (ints.length > 0) {

                if (target > ints[ints.length - 1]) {
                    continue;
                }
                for (int i : ints) {
                    if (i == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = /*{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};*/{{-5}};
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入目标值:");
        int target = scanner.nextInt();*/
        boolean flag = findNumberIn2DArray(matrix, -5);
        System.out.println("flag = " + flag);
    }
}
