package atm;

public interface ATMState {
    void insertCard();

    void enterPIN(int pin);

    void requestCash(int amount);

    void ejectCard();
}
