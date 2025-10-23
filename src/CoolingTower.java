public class CoolingTower {
    private double height;
    private double diameter;

    public CoolingTower(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("CoolingTower[height=%.2f m, diameter=%.2f m]", height, diameter);
    }
}
