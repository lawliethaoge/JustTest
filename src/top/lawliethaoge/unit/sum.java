package top.lawliethaoge.unit;

/**
 * @author hao@lawliet.com
 * @since 2018/8/8 17:02
 */
public class sum {
    public static void main(String[] args) {
        int sum = 0;
        int[] a;
        a = new int[]{1,
                3,
                3,
                3,
                3,
                3,
                3,
                4,
                4,
                4,
                5,
                6,
                6,
                7
        };
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}
