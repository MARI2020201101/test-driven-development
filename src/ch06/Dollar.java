package ch06;

class Dollar extends Money{

    public Dollar(int amount) {
        super(amount);
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


}
