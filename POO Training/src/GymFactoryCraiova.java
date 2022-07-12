import java.util.ArrayList;
import java.util.List;

public class GymFactoryCraiova implements GymActivity {
    private List<GymMember> gymmemberList = new ArrayList<>();

    public List<GymMember> getGymmemberList() {
        return gymmemberList;
    }


    public void setGymmemberList(List<GymMember> gymmemberList) {
        this.gymmemberList = gymmemberList;
    }

    @Override
    public void addMember(GymMember gymMember) {
        gymmemberList.add(gymMember);
    }

    @Override
    public void givePrizes() {
        int number = maxNumber();
        for (int i = 0; i < gymmemberList.size(); i++) {
            if(gymmemberList.get(i).getSquatsRecord()+gymmemberList.get(i).getPushUpsRecord()==number) {
                gymmemberList.get(i).setWonPrize(true);
            } else {
                gymmemberList.get(i).setWonPrize(false);
            }
        }
    }

    int maxNumber() {
        int maxNumber = gymmemberList.get(0).getPushUpsRecord() + gymmemberList.get(0).getSquatsRecord();
        gymmemberList.get(0).setWonPrize(true);
        for (int i = 1; i < gymmemberList.size(); i++) {
            if (gymmemberList.get(i).getPushUpsRecord() + gymmemberList.get(i).getSquatsRecord() >= maxNumber) {
                maxNumber=gymmemberList.get(i).getPushUpsRecord() + gymmemberList.get(i).getSquatsRecord();
            }
        }
        return maxNumber;
    }


    @Override
    public void displayWinners() {
        for (int i = 0; i < gymmemberList.size(); i++) {
            if (gymmemberList.get(i).isWonPrize()) {
                System.out.print(ConsoleColors.RED + gymmemberList.get(i).getName() + ConsoleColors.RESET + "; ");
            }
        }
    }

    @Override
    public void receiveResult(int index, int pushUpsRecords, int squatsRecords) {
        gymmemberList.get(index).setPushUpsRecord(pushUpsRecords);
        gymmemberList.get(index).setSquatsRecord(squatsRecords);

    }

    @Override
    public String toString() {
        String result="";
        for (int i = 0; i < gymmemberList.size(); i++) {
           result += gymmemberList.get(i).getName() +"; years old: "+  gymmemberList.get(i).getAge() +"; PushUps: "+ gymmemberList.get(i).getPushUpsRecord() +"; Squats "+ gymmemberList.get(i).getSquatsRecord() +"; Won prize: "+ gymmemberList.get(i).isWonPrize() +"\n";

        }
        return result;
    }
}

