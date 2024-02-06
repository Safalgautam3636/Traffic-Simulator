package Shared;
public class Turn {
    boolean forward;
    boolean backward;
    boolean left;
    boolean right;

    Turn(boolean forward, boolean backward, boolean left, boolean right) {
        this.forward = forward;
        this.backward = backward;
        this.left = left;
        this.right = right;
    }
}
