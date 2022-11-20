package bankOfCountries;

public abstract class Company {
    private String name;
    private int bonus;

    public Company(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateCompanyBonus();

}
