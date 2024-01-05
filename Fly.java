public interface Fly {

    /**
     * takes off in the sky.
     */
    void takeOff();

    /**
     * flies upward, altitude:
     */
    void ascend(int altitude);

    /**
     * glides into the air.
     */
    void glide();

    /**
     * flies downward, altitude:
     */
    void descend(int altitude);

    /**
     *
     */
    void land();
}
