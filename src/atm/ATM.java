package atm;

public class ATM  {                 // Why not implement Interface ATMState?
    private ATMState atmState;

    private ATMState noCard = new NoCard(this);
    private ATMState hasCard = new HasCard(this);
    private ATMState hasPIN = new HasPin(this);
    private ATMState noCash = new NoCash(this);

    private int cashAmount = 2000;

    public ATM() {
        this.atmState = noCard;
    }

    public void changeState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void enterPIN(int pin) {
        atmState.enterPIN(pin);
    }

    public void requestCash(int amount) {
        atmState.requestCash(amount);
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    // Getters
    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getHasPINState() {
        return hasPIN;
    }

    public ATMState getNoCashState() {
        return noCash;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    //Setters
    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }
}
