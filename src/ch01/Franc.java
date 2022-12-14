package ch01;

import java.util.Objects;
class Franc{
    private final int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
