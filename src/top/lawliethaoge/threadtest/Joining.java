package top.lawliethaoge.threadtest;

/**
 * @author hao@lawliet.com
 * @since 2018/5/25 22:26
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("Sleepy",1500),
                grumpy=new Sleeper("Grumpy",1500);
        Joiner dopey = new Joiner("Dopey",sleeper),
                doc = new Joiner("Doc",grumpy);
        grumpy.interrupt();
    }
}
