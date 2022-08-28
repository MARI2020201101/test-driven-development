package ch15;

import java.util.Objects;

class Money implements Expression {
    public int amount;
    private final String currency;
    String currency() {
        return currency;
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    @Override
    public Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency(), money.currency());
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }


    @Override
    public Expression reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount/rate, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
