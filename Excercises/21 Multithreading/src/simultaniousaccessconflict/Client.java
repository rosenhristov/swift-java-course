package simultaniousaccessconflict;

/**
 * Created by Rossen on 2.11.2016 г..
 */
public class Client extends Thread {
    String clientName;
    Account acc;
    long threadTimeInterval = 1000;

    Client(String clientName, Account acc){
        this.clientName = clientName;
        this.acc = acc;
    }

    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.printf("Client %s: BEFORE deposit: %s\n", clientName, acc.getAmmount());
                deposit(acc, 1000);
                System.out.printf("Client %s: AFTER deposit: %s\n", clientName, acc.getAmmount());
                sleep(threadTimeInterval);
            }
        } catch (InterruptedException intEx) {
            System.out.println("Exception: Current thread interrupted by another thread");
            intEx.printStackTrace();
        }
    }

    public static void deposit(Account acc, double sum) {
        synchronized (acc) {
            acc.setAmmount(acc.getAmmount() + sum);
        }
    }
}
