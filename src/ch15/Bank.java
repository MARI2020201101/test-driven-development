package ch15;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Bank {
    private Map<Pair, Integer> rates = new HashMap();
    public Money reduce(Expression source, String to) {
        return (Money) source.reduce(this, to);
    }

    int rate(String from, String to){
        if(from.equals(to)) return 1;
        Integer rate = rates.get(new Pair(from, to));
        return rate.intValue();
    }
    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from,to), rate);
    }
    private class Pair{
        private String from;
        private String to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(from, pair.from) && Objects.equals(to, pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }
}
