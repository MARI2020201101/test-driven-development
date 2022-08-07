package ch11;

class Bank {
    public Money reduce(Expression source, String to) {
        return new Money(source.amount(), to);
    }
}
