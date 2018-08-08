package top.lawliethaoge.threadtest;

/**
 * @author hao@lawliet.com
 * @since 2018/5/25 22:23
 */
public class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name ,Sleeper sleeper){
        super(name);
        this.sleeper=sleeper;
        start();
    }
    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName()+"  join completed");
    }
}
