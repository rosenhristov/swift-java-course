package simultaniousaccessconflict;

/**
 * Created by Rossen on 2.11.2016 г..
 */
class Account {
    private double ammount = 0;

    void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    double getAmmount() {
        return ammount;
    }
}