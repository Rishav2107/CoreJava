package ImmutableClasses;

public final class Mobile {
    private final int cost;
    private final String name;

    public Mobile(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
