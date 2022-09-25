package cricketConsoleApplication;

public class Player {
    private String Name;
    private int runs;
    private int six;
    private int four;
    private String ContryName;
    private boolean isOut = false;


    public boolean getIsOut() {
        return isOut;
    }

    public void setIsOut(boolean isOut) {
        this.isOut = isOut;
    }


    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }
//    String Category;


    public Player(String name, String contryName) {
        Name = name;
        ContryName = contryName;
    }

    public Player() {
    }

    public String getName() {
        return Name;
    }

    public String getContryname() {
        return ContryName;
    }
}
