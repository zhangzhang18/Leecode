package javatest;


/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-19
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread1);
        thread1.start();
        thread2.start();

    }

    static class MyThread extends Thread {

        private volatile static Integer i = 1;

        public MyThread() {
        }

        @Override
        public void run() {
            synchronized (this) {
                while (i <= 20) {
                    System.out.println(Thread.currentThread().getName() + " - " + i++);
                }
            }
        }
    }
}
