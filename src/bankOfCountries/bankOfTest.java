package bankOfCountries;

public class bankOfTest {
    public static void main(String[] args) {
    Hitit hitit = new Hitit();
    Linxa linxa = new Linxa();
    hitit.setName("hitit");
    linxa.setName("linxa");

    WorkerPerson erdo1 = new WorkerPerson(hitit);
    WorkerPerson erdo2 = new WorkerPerson(linxa);
    WorkerPerson fatih = new WorkerPerson(hitit);
    WorkerPerson furkan = new WorkerPerson(linxa);

    ZiraatBank ziraatBank = new ZiraatBank();
    AkBank akBank = new AkBank();

    akBank.giveBonus(erdo1);
    akBank.giveBonus(furkan);
    ziraatBank.giveBonus(fatih);
    ziraatBank.giveBonus(erdo2);

    }
}
