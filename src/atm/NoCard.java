package atm;

public class NoCard implements ATMState {
    private ATM atm;

    public NoCard(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        atm.changeState(atm.getHasCardState());
        System.out.println("Please enter your PIN!");
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("Please insert your card first!");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please insert your card first!");
    }

    @Override
    public void ejectCard() {
        System.out.println("There is no card to eject!");
    }
}
