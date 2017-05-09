package atm;

public class HasCard implements ATMState {
    private ATM atm;

    public HasCard(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Your card is already inserted!");
    }

    @Override
    public void enterPIN(int pin) {
        if (pin == 1234) {
            atm.changeState(atm.getHasPINState());
        } else {
            System.out.println("Wrong PIN-Number!");
            atm.changeState(atm.getNoCardState());
            System.out.println("Your card is ejected!");
        }
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please enter your PIN first!");
    }

    @Override
    public void ejectCard() {
        atm.changeState(atm.getNoCardState());
        System.out.println("Card is ejected!");
    }
}
