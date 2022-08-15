package ch11;



import java.util.Objects;

class Money implements Expression{
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

    protected Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    };
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

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public int amount() {
        return amount;
    }

    @Override
    public Money reduce(String to) {
        return this;
    }
}
