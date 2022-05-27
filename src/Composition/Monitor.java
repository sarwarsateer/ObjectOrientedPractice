package Composition;

public class Monitor {
    private String model;
    private String manufucturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufucturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufucturer = manufucturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }
}
