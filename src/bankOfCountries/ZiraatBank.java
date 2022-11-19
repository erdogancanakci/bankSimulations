package bankOfCountries;

public class ZiraatBank implements Bank{
    private final String name = "Ziraat Bankası";
    private final int bankBonus = 80;

    public String getName() {
        return name;
    }

    @Override
    public void giveBonus(WorkerPerson workerPerson) {
        Company company = workerPerson.getCompany();
        int companyBonus = company.calculateCompanyBonus();
        int totalBonus = companyBonus + bankBonus;
        System.out.println("Bank: " + this.getName() + " Company: " + company.getName() + " total bonus: " + totalBonus);
    }
}
