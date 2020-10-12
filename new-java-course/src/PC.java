public class PC {

    /*
        PC has case, monitor and Motherboard
        sometimes inheritance can cause problems
        this solves by composition
     */
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        //getMonitor().drawPixelAt(1200, 50, "yellow"); --> using getter
        monitor.drawPixelAt(1200, 50, "yellow"); //using fields
    }

    public void powerUp() {
        //getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
