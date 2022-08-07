package ch06;

import java.util.Objects;

class Money {
    protected final int amount;
    public Money(int amount) {
        this.amount = amount;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    private <T extends Money> T createContents(Class<T> clazz) {
        T instance = null;
        try {
            instance = clazz.getDeclaredConstructor(int.class).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }


}
