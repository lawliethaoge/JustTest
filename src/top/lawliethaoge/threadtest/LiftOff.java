package top.lawliethaoge.threadtest;

import java.util.concurrent.TimeUnit;

/**
 * @author hao@lawliet.com
 * @since 2018/5/24 19:59
 */
public class LiftOff implements Runnable {
    private int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {
        while (countDown-->0){
            System.out.print(status());
//            Thread.yield();
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random()*10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
