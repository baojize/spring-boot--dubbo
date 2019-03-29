package com.kuiniu.springbootdubboapi.thread;

/**
 * @className: thread
 * @date：2019/3/29 0029 11:43
 * @author: baojize
 * @accountfor：
 */
public class thread implements Runnable {
    private static int count;
    public thread(){
        count = 0;
    }
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int getCount(){
        return count;
    }
}
