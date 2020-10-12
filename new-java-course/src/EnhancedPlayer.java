public class EnhancedPlayer {

    //fields private --> outside class will not access these fields
    private String name;
    /*
        private int health = 100; --> changed field name but
        still the code works without affecting other code
     */
    private int hitPoints = 100; //default initial value
    private String weapon;

    //Ensured that name, health and weapon is initialized
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //health validation
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }
    /*
     whole process or calculation is being done here
     so changing the logic or fields in this class will
     automatically gets updated everywhere
     */
    public void looseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //reduce no of lives remaining
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
