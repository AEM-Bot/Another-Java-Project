public class Player {
    /*
        Bad Example of Encapsulation
     */
    //public scope used here for explanation
    //public String name;

    //change the field name makes it to change every where it is being accessed
    public String firstName;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health -= damage;
        /*
            whole process or calculation is being done here
         */
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce no of lives remaining
        }
    }

    public int healthRemaining() {
        return this.health;
    }


}
