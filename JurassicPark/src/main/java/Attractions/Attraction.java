package Attractions;

public abstract class Attraction {
    private String name;
    private Dinosaur dinosaur;
    private int enclosureHP;

    public Attraction(String name,Dinosaur dinosaur,int enclosureHP){
        this.name = name;
        this.dinosaur = dinosaur;
        this.enclosureHP = enclosureHP;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public int getEnclosureHP() {
        return enclosureHP;
    }

    public void setEnclosureHP(int enclosureHP) {
        this.enclosureHP = enclosureHP;
    }

    public void reduceEnclosureHP(){
        this.enclosureHP -= 1;
    }
}
