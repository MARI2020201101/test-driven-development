package ch06;

class Franc extends Money{

    public Franc(int amount) {
        super(amount);
    }
    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }



}
