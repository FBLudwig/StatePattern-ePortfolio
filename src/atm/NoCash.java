package atm;

public class NoCash implements ATMState {
    private ATM atm;

    public NoCash(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have any money!");
        System.out.println("Your card is ejected!");
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("We don't have any money!");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("We don't have any money!");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have any money!");
        System.out.println("There is no card to eject!");
    }
}
