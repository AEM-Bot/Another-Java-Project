public class PlayerRunner {

    /*
        Bad Practice without encapsulation
     */
    public static void main(String[] args) {
        Player player = new Player();
        //player.name = "sasanka";
        player.firstName = "Sasanka";
        player.health = 20;
        player.weapon = "AKM";

        int damage = 10;
        player.looseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        /*
            Issue 1 --> assigning health directly opening to more bugs
            --> no control on the code in Player Class
            Issue 2 --> name field is changed inside the Player class
            --> every where this name field being referenced has to be updated
            which again leads to issues in the code
            Issue 3 --> Not ensuring which field should be validated and required
            while initiating the object
         */

        player.health = 200;
        player.looseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

    }
}
