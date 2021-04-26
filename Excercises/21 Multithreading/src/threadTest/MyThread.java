package threadTest;

/**
 * Created by Rossen on 2.11.2016 г..
 */
class MyThread extends Thread {
    private String threadName;
    private long threadTimeInterval;

    public MyThread(String aName, long aTimeInterval) {
        threadName = aName;
        threadTimeInterval = aTimeInterval;
    }

    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println(threadName);
                sleep(threadTimeInterval);
            }
        } catch (InterruptedException intEx) {
            // Current thread interrupted by another thread
        }
    }
}