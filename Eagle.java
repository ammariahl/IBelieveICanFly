public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky.");
    }

    @Override
    public void ascend(int altitude) {
        System.out.println(this.getName() + " flies upward, altitude: " + altitude);
    }

    @Override
    public void glide() {
        System.out.println("glides into the air.");
    }

    @Override
    public void descend(int altitude) {
        System.out.println(this.getName() + " flies downward, altitude: " + altitude);
    }

    @Override
    public void land() {

        if (this.getAltitude() != 0) {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
        else {
            System.out.println(this.getName() + " lands on the ground.");
        }
      }
}
