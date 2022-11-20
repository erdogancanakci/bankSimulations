package bankOfCountries;

public class bankOfTest {
    public static void main(String[] args) {
    CBA CBA = new CBA();
    ABC ABC = new ABC();
    CBA.setName("hitit");
    ABC.setName("linxa");

    WorkerPerson erdo1 = new WorkerPerson(CBA);
    WorkerPerson erdo2 = new WorkerPerson(ABC);
    WorkerPerson fatih = new WorkerPerson(CBA);
    WorkerPerson furkan = new WorkerPerson(ABC);

    ZiraatBank ziraatBank = new ZiraatBank();
    AkBank akBank = new AkBank();

    akBank.giveBonus(erdo1);
    akBank.giveBonus(furkan);
    ziraatBank.giveBonus(fatih);
    ziraatBank.giveBonus(erdo2);

    }
}
