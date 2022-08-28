package ch15;

interface Expression {

    Expression reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
