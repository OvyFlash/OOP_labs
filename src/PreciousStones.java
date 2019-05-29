

public  class PreciousStones implements Comparable<PreciousStones> {
    private String name;
    private String group;
    private String clarity;
    private double weight;
    private int cost;


    //public Evolve() {}

    PreciousStones (String name, String group, String clarity, double weight, int cost) {
        this.name = name;
        this.group = setGroup(group);
        this.clarity = clarity;
        this.weight = weight;
        this.cost = cost;
    }

    public String setGroup(String group) {
        if ((group.toLowerCase().equals("preciousstone")) || (group.toLowerCase().equals("semi-preciousstone"))){
            return group;
        } else {
            return "undefined";
        }
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getClarity() {
        return clarity;
    }

    public double getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int compareTo(PreciousStones other) {
        if(this.cost > other.getCost() )
            return 1;
        else if (this.getCost() == other.getCost() )
            return 0;
        return -1;
    }
}
// А ЕСЛИ СОЗДАТЬ КЛАСС JEWERLY СО ВСЕМ ЭТИМ, И УНАСЛЕДОВАТЬ ОТ НЕГО SEMI-PRECIOUS I PRECIOUS