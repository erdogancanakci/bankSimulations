package bankOfCountries;

public class BankFactory implements Bank{
    private String name;
    private int bankBonus;

    public void setName(String name) {
        this.name = name;
    }

    public int getBankBonus() {
        return bankBonus;
    }

    public void setBankBonus(int bankBonus) {
        this.bankBonus = bankBonus;
    }

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
