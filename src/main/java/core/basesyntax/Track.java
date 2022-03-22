package core.basesyntax;

public class Track extends Machine {
    @Override
    public void goWork() {
        System.out.println("Track started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stopped work");
    }
}