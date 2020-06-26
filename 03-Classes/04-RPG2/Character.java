// VERSION 2.0.0

public class Character {

    // Instance variables
    private String name;
    private String className;
    
    private int currentHealth;
    private int strength;
    private int defense;
    private int special;
    private int points;
    
    private int wins;
    private int losses;

    private final boolean DEBUG = true; // Will be changed to false during official battle

    private int[] myStats = new int[5]; //    [currentHealth, strength, defense, special, points]
    private int[] oppInfo; //    [currentHealth, strength, defense, special, points]


    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }    

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }    

    public boolean getDebug() {
        return DEBUG;
    }

    public int[] getMyInfo() {

        if (DEBUG) {
            System.out.println(name + "'s stats have been given away");
        }

        return new int[] {getCurrentHealth(),getStrength(),getDefense(),getSpecial(),getPoints()};
    }

    public int[] getOppInfo() {
        return oppInfo;
    }

    public void setMyInfo(){
        myStats[0] = currentHealth;
        myStats[2] = strength;
        myStats[3] = defense;
        myStats[4] = special;
        myStats[5] = points;
    }
    
    // Other methods


    @Override
    public String toString() {
        return  "name='" + name +
                ", className=" + className +
                ", currentHealth=" + currentHealth +
                ", strength=" + strength +
                ", defense=" + defense +
                ", special=" + special +
                ", points=" + points + 
                ", wins= " + wins +
                ", losses= " + losses;
    }

    public void loadOppInfo(int[] oppStats) {

        if (DEBUG) {
            System.out.println("Opponents stats have been received.");
        }

        oppInfo = oppStats;
    }

    public double attack() {
        System.out.println(name + "  attacks!");
    }
    
    public double defend() {
        System.out.println(name + "  defends!");
    }
    
    public void specialEffect() {
        System.out.println(name + "  implements SPECIAL!");
    }




}





