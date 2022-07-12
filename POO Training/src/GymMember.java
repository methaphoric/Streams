public class GymMember implements Workout{
    private String name;
    private int age;
    private int pushUpsRecord;
    private int squatsRecord;
    private boolean wonPrize;

    public boolean isWonPrize() {
        return wonPrize;
    }

    public void setWonPrize(boolean wonPrize) {
        this.wonPrize = wonPrize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPushUpsRecord() {
        return pushUpsRecord;
    }

    public void setPushUpsRecord(int pushUpsRecord) {
        this.pushUpsRecord = pushUpsRecord;
    }

    public int getSquatsRecord() {
        return squatsRecord;
    }

    public void setSquatsRecord(int squatsRecord) {
        this.squatsRecord = squatsRecord;
    }

    @Override
    public void pushUps(String pushUpsRecord) {
        System.out.println(this.name +" pushups record: "+ pushUpsRecord);
    }

    @Override
    public void squats(String squatsRecord) {
        System.out.println(this.name +" squats record: "+ squatsRecord);
    }


    public GymMember(String name, int age, int pushUpsRecord, int squatsRecord, boolean wonPrize) {
        this.name = name;
        this.age = age;
        this.pushUpsRecord = pushUpsRecord;
        this.squatsRecord = squatsRecord;
        this.wonPrize = wonPrize;
    }


}
