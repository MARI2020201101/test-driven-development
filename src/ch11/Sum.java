package ch11;

class Sum implements Expression{
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend =addend;
    }

    @Override
    public int amount() {
        return augend.amount() + addend.amount();
    }
}
