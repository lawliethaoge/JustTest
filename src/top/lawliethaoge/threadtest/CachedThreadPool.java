package top.lawliethaoge.threadtest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * @author hao@lawliet.com
 * @since 2018/5/24 20:12
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++)
            executorService.execute(new LiftOff());
        executorService.shutdown();


    }
}
