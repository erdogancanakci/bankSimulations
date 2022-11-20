package bankOfCountries;

public class BankOfTest {
    public static void main(String[] args) {
    CBA CBA = new CBA();
    ABC ABC = new ABC();
    CBA.setName("cba");
    ABC.setName("abc");

    WorkerPerson erdo1 = new WorkerPerson(CBA);
    WorkerPerson erdo2 = new WorkerPerson(ABC);
    WorkerPerson fatih = new WorkerPerson(CBA);
    WorkerPerson furkan = new WorkerPerson(ABC);

    Banks z1 = new Banks();
    z1.setName("ziraat");
    Banks z2 = new Banks();
    z2.setName("akbank");
    z1.setBankBonus(100);
    z2.setBankBonus(200);

    z1.giveBonus(erdo1);
    z1.giveBonus(furkan);
    z2.giveBonus(fatih);
    z2.giveBonus(erdo2);

    }
}
