public class OutlanderRunner {

    public static void main(String[] args) {
        Outlander outlander = new Outlander(24);

        outlander.steer(30);
        outlander.accelerate(30);
        outlander.accelerate(20);

        outlander.accelerate(-42);
    }
}
