import java.util.List;

public interface GymActivity {
    void addMember(GymMember gymMember);
    void givePrizes();

    public List<GymMember> getGymmemberList();

    void displayWinners();

    void receiveResult(int index, int pushUpsRecords, int squatsRecords);
}
