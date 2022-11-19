package bankOfCountries;

public abstract class Company {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateCompanyBonus();

}
