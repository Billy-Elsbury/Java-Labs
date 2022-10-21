package labsheet8.Exercise1;

public class Bicycle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(int gearCount, boolean hasBell) {
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gearCount=" + getGearCount() +
                ", hasBell=" + hasBell +
                '}';
    }
}
