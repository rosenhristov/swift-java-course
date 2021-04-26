package simultaniousaccessconflict;

/**
 * Created by Rossen on 2.11.2016 г..
 */
class Bank {
    public static void main(String... args) {
        Account acc = new Account();
        Client client1 = new Client("Client 1", acc);
        Client client2 = new Client("Client 2", acc);
        client1.start();
        client2.start();

    }
}
