package bankOfCountries;

public class BankOfTest {
    public static void main(String[] args) {

    CompanyFactory abc = new CompanyFactory("abc", 150);
    CompanyFactory fairy = new CompanyFactory("fairy", 400);


    WorkerPerson erdo1 = new WorkerPerson(abc);
    WorkerPerson erdo2 = new WorkerPerson(abc);
    WorkerPerson fatih = new WorkerPerson(fairy);
    WorkerPerson furkan = new WorkerPerson(fairy);

    BankFactory z1 = new BankFactory();
    z1.setName("ziraat");
    BankFactory z2 = new BankFactory();
    z2.setName("akbank");
    z1.setBankBonus(125);
    z2.setBankBonus(200);

    z1.giveBonus(erdo1);
    z1.giveBonus(furkan);
    z2.giveBonus(fatih);
    z2.giveBonus(erdo2);

    }
}
