package top.lawliethaoge.threadtest;

import static sun.misc.Version.print;

/**
 * @author hao@lawliet.com
 * @since 2018/5/25 22:17
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + "was interrupted." + "isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + "  has awakened");
    }
}
