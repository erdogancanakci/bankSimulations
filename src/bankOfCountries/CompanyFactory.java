package bankOfCountries;

public class CompanyFactory extends Company{

    public CompanyFactory(String name, int bonus) {
        super(name, bonus);
    }

    @Override
    public int calculateCompanyBonus() {
        return getBonus();
    }
}
