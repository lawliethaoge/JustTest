package top.lawliethaoge.threadtest;

/**
 * @author hao@lawliet.com
 * @since 2018/5/24 20:06
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }
}
