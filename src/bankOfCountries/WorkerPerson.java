package bankOfCountries;

public class WorkerPerson extends Person {
    Company company;

    public WorkerPerson(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
