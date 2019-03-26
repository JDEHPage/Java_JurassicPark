package Park;

public class Visitor {

    private int age;
    private boolean criminal;
    private double monies;

    public Visitor(int age, double monies){
        this.age = age;
        this.criminal = false;
        this.monies = monies;
    }

    public int getAge() {
        return age;
    }

    public boolean getStatus() {
        return this.criminal;
    }

    public void setCriminal(boolean status) {
        this.criminal = status;
    }

    public double getMonies() {
        return monies;
    }

    public void setMonies(double monies) {
        this.monies = monies;
    }
}
