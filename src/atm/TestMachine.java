package atm;

public class TestMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard();
        atm.ejectCard();
        atm.insertCard();
        atm.enterPIN(1234);
        atm.requestCash(2000);


    }
}
