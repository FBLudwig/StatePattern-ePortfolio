package atm;

public class HasPin implements ATMState {
    private ATM atm;

    public HasPin(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Your card is already inserted!");
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("You already entered your PIN!");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atm.getCashAmount()) {
            System.out.println("Sorry, ATM has not enough cash!");
            atm.changeState(atm.getNoCardState());
            System.out.println("Your card is ejected!");
        } else {
            atm.setCashAmount(atm.getCashAmount() - cashToWithdraw);

            atm.changeState(atm.getNoCardState());
            System.out.println("Your card is ejected!");

            if (atm.getCashAmount() <= 0) {
                atm.changeState(atm.getNoCashState());
            }

            System.out.println(cashToWithdraw + "€ is provided by the machine!");
        }
    }

    @Override
    public void ejectCard() {
        atm.changeState(atm.getNoCardState());
        System.out.println("Card is ejected");
    }
}
